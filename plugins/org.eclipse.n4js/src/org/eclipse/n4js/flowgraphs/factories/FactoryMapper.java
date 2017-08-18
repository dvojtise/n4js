/**
 * Copyright (c) 2017 Marcus Mews.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Marcus Mews - Initial API and implementation
 */
package org.eclipse.n4js.flowgraphs.factories;

import org.eclipse.n4js.n4JS.ControlFlowElement;
import org.eclipse.n4js.n4JS.ExpressionStatement;
import org.eclipse.n4js.n4JS.FunctionDeclaration;
import org.eclipse.n4js.n4JS.LabelledStatement;

/**
 *
 */
public class FactoryMapper extends Dispatcher {

	/**
	 * Maps the given {@link ControlFlowElement} as defined. Is invoked repeatedly until a fixpoint is reached.
	 */
	static public ControlFlowElement map(ControlFlowElement cfe) {
		ControlFlowElement lastCFE = null;
		while (cfe != null && lastCFE != cfe) {
			lastCFE = cfe;
			cfe = mapInternal(cfe);
		}
		return lastCFE;
	}

	static private ControlFlowElement mapInternal(ControlFlowElement cfe) {
		try {
			return dispatch("_map", cfe);
		} catch (NoDispatchMethodFoundException e) {
			return cfe;
		}
	}

	static ControlFlowElement _map(FunctionDeclaration feature) {
		return feature.getBody();
	}

	static ControlFlowElement _map(LabelledStatement feature) {
		return feature.getStatement();
	}

	static ControlFlowElement _map(ExpressionStatement feature) {
		return feature.getExpression();
	}

}
