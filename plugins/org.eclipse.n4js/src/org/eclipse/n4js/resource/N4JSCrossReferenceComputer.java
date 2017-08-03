/**
 * Copyright (c) 2016 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   NumberFour AG - Initial API and implementation
 */
package org.eclipse.n4js.resource;

import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.n4js.n4JS.N4JSPackage;
import org.eclipse.n4js.n4JS.N4MemberDeclaration;
import org.eclipse.n4js.n4JS.Script;
import org.eclipse.n4js.scoping.members.ComposedMemberScope;
import org.eclipse.n4js.ts.scoping.builtin.N4Scheme;
import org.eclipse.n4js.ts.typeRefs.TypeRef;
import org.eclipse.n4js.ts.types.IdentifiableElement;
import org.eclipse.n4js.ts.types.TMember;
import org.eclipse.n4js.ts.types.Type;
import org.eclipse.n4js.ts.types.TypesPackage;
import org.eclipse.n4js.ts.utils.TypeHelper;
import org.eclipse.n4js.utils.N4JSLanguageUtils;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;

/**
 * Collects all Types,TVariables,TLiterals and IdentifiableElements referenced within the AST of a given fully*resolved
 * resource,when they aren'tcontained in this resource,fully resolved and no built-in type.Additional*checks can be
 * performed by the passed acceptor.*
 * <p>
 * Helper for{@link N4JSResourceDescription}.
 *
 */
public class N4JSCrossReferenceComputer {

	@Inject
	private N4JSExternalReferenceChecker externalReferenceChecker;
	@Inject
	private TypeHelper th;

	/**
	 * Collects all Types, TVariables, TLiterals and IdentifiableElements that are directly referenced somewhere in the
	 * given resource and aren't contained in this resource. References between AST element to its defined type and vice
	 * versa as well as references to built-in and primitive types are ignored.
	 *
	 * @param resource
	 *            the given fully resolved resource
	 * @param acceptor
	 *            the logic that collects the passed EObject found in a cross reference
	 */
	public void computeCrossRefs(Resource resource, IAcceptor<ImmutablePair<EObject, EObject>> acceptor) {
		TreeIterator<EObject> allContentsIter;
		if (resource instanceof N4JSResource) {
			Script script = (Script) ((N4JSResource) resource).getContents().get(0);
			// We only traverse AST tree without cached elements.
			allContentsIter = N4JSLanguageUtils.getAllContentsWithoutCachedElements(script);
		} else {
			allContentsIter = resource.getAllContents();
		}

		while (allContentsIter.hasNext()) {
			EObject eObject = allContentsIter.next();
			computeCrossRefs(resource, eObject, acceptor);
		}
	}

	/*
	 * Browse all references type by the EClass of the given EObject ignoring References between AST element to its
	 * defined type and vice versa.
	 */
	private void computeCrossRefs(Resource resource, EObject from,
			IAcceptor<ImmutablePair<EObject, EObject>> acceptor) {
		EList<EReference> references = from.eClass().getEAllReferences();
		for (EReference eReference : references) {
			// We only follow cross references
			if (!eReference.isContainment()) {
				if (eReference != N4JSPackage.Literals.TYPE_DEFINING_ELEMENT__DEFINED_TYPE
						&& eReference != TypesPackage.Literals.SYNTAX_RELATED_TELEMENT__AST_ELEMENT) {
					if (from.eIsSet(eReference)) {
						Object val = from.eGet(eReference);
						// Handle both toOne and toMany cases
						if (!eReference.isMany()) {
							handleReferenceObject(resource, from, acceptor, (EObject) val);
						} else {
							@SuppressWarnings("unchecked")
							BasicEList<EObject> list = (BasicEList<EObject>) val;
							for (int i = 0; i < list.size(); i++) {
								EObject to = list.basicGet(i);
								handleReferenceObject(resource, from, acceptor, to);
							}
						}
					}
				}
			}
		}
	}

	/*
	 * Collect references to type references, types and identifiable element (direct or as part of and property access
	 * expression):
	 */
	private void handleReferenceObject(Resource resource, EObject from,
			IAcceptor<ImmutablePair<EObject, EObject>> acceptor, EObject to) {
		if (to instanceof TypeRef) {
			handleTypeRef(resource, from, acceptor, (TypeRef) to);
		} else if (to instanceof Type) {
			handleType(resource, from, acceptor, (Type) to);
		} else if (to instanceof TMember) {
			// Handle composed member
			handleComposedMember(resource, from, acceptor, (TMember) to);
		} else if (to instanceof IdentifiableElement) {
			handleIdentifiableElement(resource, from, acceptor, (IdentifiableElement) to);
		}
	}

	private void handleComposedMember(Resource resource, EObject from,
			IAcceptor<ImmutablePair<EObject, EObject>> acceptor, TMember to) {
		if (ComposedMemberScope.isComposedMember(to)) {
			// Special handling for composed members
			// Add the constituent members
			for (TMember constituentMember : to.getConstituentMembers()) {
				// Since the constituentMember node may actually be located in another resource,
				// we need to navigate to the original resource.
				N4MemberDeclaration fromMemberDecl = (N4MemberDeclaration) constituentMember.getAstElement();
				TMember originalMember = fromMemberDecl.getDefinedTypeElement();
				handleIdentifiableElement(resource, fromMemberDecl, acceptor, originalMember);
			}
		} else {
			// Standard case
			handleIdentifiableElement(resource, from, acceptor, to);
		}
	}

	/*
	 * Extract declared type for the given type reference.
	 */
	private void handleTypeRef(Resource resource, EObject from, IAcceptor<ImmutablePair<EObject, EObject>> acceptor,
			TypeRef to) {
		List<Type> toTypes = th.extractType(to);
		for (Type toType : toTypes)
			handleType(resource, from, acceptor, toType);
	}

	private void handleType(Resource resource, EObject from, IAcceptor<ImmutablePair<EObject, EObject>> acceptor,
			Type to) {
		if (to != null && !N4Scheme.isFromResourceWithN4Scheme(to)
				&& externalReferenceChecker.isResolvedAndExternal(resource, to)) {
			acceptor.accept(new ImmutablePair<EObject, EObject>(from, to));
		}
	}

	private void handleIdentifiableElement(Resource resource, EObject from,
			IAcceptor<ImmutablePair<EObject, EObject>> acceptor,
			IdentifiableElement to) {
		if (to != null) {
			// guard against null resource that is sometimes returned if a member was put into a
			// union type ref that is not contained in a resource and does not have an original decl
			if (resource != null && !N4Scheme.isFromResourceWithN4Scheme(to)
					&& externalReferenceChecker.isResolvedAndExternal(resource, to)) {
				acceptor.accept(new ImmutablePair<EObject, EObject>(from, to));
			} else if (resource == null && !to.eIsProxy()) {
				// we want to record these imported names anyway
				acceptor.accept(new ImmutablePair<EObject, EObject>(from, to));
			}
		}
	}
}
