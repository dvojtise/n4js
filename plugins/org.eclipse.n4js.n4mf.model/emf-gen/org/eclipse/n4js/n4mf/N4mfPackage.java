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
package org.eclipse.n4js.n4mf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * Copyright (c) 2016 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  * Contributors:
 *   NumberFour AG - Initial API and implementation
 * <!-- end-model-doc -->
 * @see org.eclipse.n4js.n4mf.N4mfFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel fileExtensions='n4mf' modelDirectory='/org.eclipse.n4js.n4mf.model/emf-gen' forceOverwrite='true' updateClasspath='false' complianceLevel='8.0' copyrightFields='false' copyrightText='Copyright (c) 2016 NumberFour AG.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n  NumberFour AG - Initial API and implementation' language='' basePackage='org.eclipse.n4js'"
 * @generated
 */
public interface N4mfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "n4mf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/n4js/n4mf/N4MF";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "n4mf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	N4mfPackage eINSTANCE = org.eclipse.n4js.n4mf.impl.N4mfPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.SimpleProjectDescriptionImpl <em>Simple Project Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.SimpleProjectDescriptionImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getSimpleProjectDescription()
	 * @generated
	 */
	int SIMPLE_PROJECT_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Declared Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROJECT_DESCRIPTION__DECLARED_VENDOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROJECT_DESCRIPTION__PROJECT_ID = 1;

	/**
	 * The number of structural features of the '<em>Simple Project Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Vendor Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROJECT_DESCRIPTION___GET_VENDOR_ID = 0;

	/**
	 * The number of operations of the '<em>Simple Project Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROJECT_DESCRIPTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ProjectDescriptionImpl <em>Project Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ProjectDescriptionImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectDescription()
	 * @generated
	 */
	int PROJECT_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Declared Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__DECLARED_VENDOR_ID = SIMPLE_PROJECT_DESCRIPTION__DECLARED_VENDOR_ID;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__PROJECT_ID = SIMPLE_PROJECT_DESCRIPTION__PROJECT_ID;

	/**
	 * The feature id for the '<em><b>Vendor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__VENDOR_NAME = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__PROJECT_VERSION = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Project Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__PROJECT_TYPE = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__MAIN_MODULE = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extended Runtime Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__EXTENDED_RUNTIME_ENVIRONMENT = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Provided Runtime Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__PROVIDED_RUNTIME_LIBRARIES = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Required Runtime Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__REQUIRED_RUNTIME_LIBRARIES = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Project Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__PROJECT_DEPENDENCIES = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Implementation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__IMPLEMENTATION_ID = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Implemented Projects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__IMPLEMENTED_PROJECTS = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Init Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__INIT_MODULES = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Exec Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__EXEC_MODULE = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__OUTPUT_PATH = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Library Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__LIBRARY_PATHS = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Resource Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__RESOURCE_PATHS = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Source Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__SOURCE_FRAGMENT = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Module Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__MODULE_FILTERS = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Tested Projects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__TESTED_PROJECTS = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Module Loader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION__MODULE_LOADER = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Project Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION_FEATURE_COUNT = SIMPLE_PROJECT_DESCRIPTION_FEATURE_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Vendor Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION___GET_VENDOR_ID = SIMPLE_PROJECT_DESCRIPTION___GET_VENDOR_ID;

	/**
	 * The operation id for the '<em>Get All Tested Projects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION___GET_ALL_TESTED_PROJECTS = SIMPLE_PROJECT_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Init Modules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION___GET_ALL_INIT_MODULES = SIMPLE_PROJECT_DESCRIPTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Implemented Projects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION___GET_ALL_IMPLEMENTED_PROJECTS = SIMPLE_PROJECT_DESCRIPTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Project Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION___GET_ALL_PROJECT_DEPENDENCIES = SIMPLE_PROJECT_DESCRIPTION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Provided Runtime Libraries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION___GET_ALL_PROVIDED_RUNTIME_LIBRARIES = SIMPLE_PROJECT_DESCRIPTION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get All Required Runtime Libraries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION___GET_ALL_REQUIRED_RUNTIME_LIBRARIES = SIMPLE_PROJECT_DESCRIPTION_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Project Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTION_OPERATION_COUNT = SIMPLE_PROJECT_DESCRIPTION_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ExecModuleImpl <em>Exec Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ExecModuleImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getExecModule()
	 * @generated
	 */
	int EXEC_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Exec Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_MODULE__EXEC_MODULE = 0;

	/**
	 * The number of structural features of the '<em>Exec Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_MODULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exec Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.TestedProjectsImpl <em>Tested Projects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.TestedProjectsImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getTestedProjects()
	 * @generated
	 */
	int TESTED_PROJECTS = 2;

	/**
	 * The feature id for the '<em><b>Tested Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTED_PROJECTS__TESTED_PROJECTS = 0;

	/**
	 * The number of structural features of the '<em>Tested Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTED_PROJECTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tested Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTED_PROJECTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.InitModulesImpl <em>Init Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.InitModulesImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getInitModules()
	 * @generated
	 */
	int INIT_MODULES = 3;

	/**
	 * The feature id for the '<em><b>Init Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_MODULES__INIT_MODULES = 0;

	/**
	 * The number of structural features of the '<em>Init Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_MODULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Init Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_MODULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ImplementedProjectsImpl <em>Implemented Projects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ImplementedProjectsImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getImplementedProjects()
	 * @generated
	 */
	int IMPLEMENTED_PROJECTS = 4;

	/**
	 * The feature id for the '<em><b>Implemented Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_PROJECTS__IMPLEMENTED_PROJECTS = 0;

	/**
	 * The number of structural features of the '<em>Implemented Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_PROJECTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Implemented Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_PROJECTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ProjectDependenciesImpl <em>Project Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ProjectDependenciesImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectDependencies()
	 * @generated
	 */
	int PROJECT_DEPENDENCIES = 5;

	/**
	 * The feature id for the '<em><b>Project Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPENDENCIES__PROJECT_DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Project Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPENDENCIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Project Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPENDENCIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ProvidedRuntimeLibrariesImpl <em>Provided Runtime Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ProvidedRuntimeLibrariesImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProvidedRuntimeLibraries()
	 * @generated
	 */
	int PROVIDED_RUNTIME_LIBRARIES = 6;

	/**
	 * The feature id for the '<em><b>Provided Runtime Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_RUNTIME_LIBRARIES__PROVIDED_RUNTIME_LIBRARIES = 0;

	/**
	 * The number of structural features of the '<em>Provided Runtime Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_RUNTIME_LIBRARIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provided Runtime Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_RUNTIME_LIBRARIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.RequiredRuntimeLibrariesImpl <em>Required Runtime Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.RequiredRuntimeLibrariesImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getRequiredRuntimeLibraries()
	 * @generated
	 */
	int REQUIRED_RUNTIME_LIBRARIES = 7;

	/**
	 * The feature id for the '<em><b>Required Runtime Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RUNTIME_LIBRARIES__REQUIRED_RUNTIME_LIBRARIES = 0;

	/**
	 * The number of structural features of the '<em>Required Runtime Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RUNTIME_LIBRARIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Required Runtime Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RUNTIME_LIBRARIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ProjectReferenceImpl <em>Project Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ProjectReferenceImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectReference()
	 * @generated
	 */
	int PROJECT_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE__PROJECT = 0;

	/**
	 * The number of structural features of the '<em>Project Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Project Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.SimpleProjectDependencyImpl <em>Simple Project Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.SimpleProjectDependencyImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getSimpleProjectDependency()
	 * @generated
	 */
	int SIMPLE_PROJECT_DEPENDENCY = 16;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROJECT_DEPENDENCY__PROJECT = PROJECT_REFERENCE__PROJECT;

	/**
	 * The number of structural features of the '<em>Simple Project Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROJECT_DEPENDENCY_FEATURE_COUNT = PROJECT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROJECT_DEPENDENCY___GET_SCOPE = PROJECT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Project Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROJECT_DEPENDENCY_OPERATION_COUNT = PROJECT_REFERENCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.TestedProjectImpl <em>Tested Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.TestedProjectImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getTestedProject()
	 * @generated
	 */
	int TESTED_PROJECT = 9;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTED_PROJECT__PROJECT = SIMPLE_PROJECT_DEPENDENCY__PROJECT;

	/**
	 * The feature id for the '<em><b>Version Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTED_PROJECT__VERSION_CONSTRAINT = SIMPLE_PROJECT_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declared Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTED_PROJECT__DECLARED_SCOPE = SIMPLE_PROJECT_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tested Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTED_PROJECT_FEATURE_COUNT = SIMPLE_PROJECT_DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTED_PROJECT___GET_SCOPE = SIMPLE_PROJECT_DEPENDENCY___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Tested Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTED_PROJECT_OPERATION_COUNT = SIMPLE_PROJECT_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.DeclaredVersionImpl <em>Declared Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.DeclaredVersionImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getDeclaredVersion()
	 * @generated
	 */
	int DECLARED_VERSION = 10;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_VERSION__MAJOR = 0;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_VERSION__MINOR = 1;

	/**
	 * The feature id for the '<em><b>Micro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_VERSION__MICRO = 2;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_VERSION__QUALIFIER = 3;

	/**
	 * The number of structural features of the '<em>Declared Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_VERSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Declared Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.SourceFragmentImpl <em>Source Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.SourceFragmentImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getSourceFragment()
	 * @generated
	 */
	int SOURCE_FRAGMENT = 11;

	/**
	 * The feature id for the '<em><b>Source Fragment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FRAGMENT__SOURCE_FRAGMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FRAGMENT__PATHS = 1;

	/**
	 * The number of structural features of the '<em>Source Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FRAGMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Compare By Fragment Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FRAGMENT___COMPARE_BY_FRAGMENT_TYPE__SOURCEFRAGMENT = 0;

	/**
	 * The number of operations of the '<em>Source Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FRAGMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ModuleFilterImpl <em>Module Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ModuleFilterImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getModuleFilter()
	 * @generated
	 */
	int MODULE_FILTER = 12;

	/**
	 * The feature id for the '<em><b>Module Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FILTER__MODULE_FILTER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Module Specifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FILTER__MODULE_SPECIFIERS = 1;

	/**
	 * The number of structural features of the '<em>Module Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.BootstrapModuleImpl <em>Bootstrap Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.BootstrapModuleImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getBootstrapModule()
	 * @generated
	 */
	int BOOTSTRAP_MODULE = 13;

	/**
	 * The feature id for the '<em><b>Module Specifier With Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_MODULE__MODULE_SPECIFIER_WITH_WILDCARD = 0;

	/**
	 * The feature id for the '<em><b>Source Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_MODULE__SOURCE_PATH = 1;

	/**
	 * The number of structural features of the '<em>Bootstrap Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bootstrap Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ExtendedRuntimeEnvironmentImpl <em>Extended Runtime Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ExtendedRuntimeEnvironmentImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getExtendedRuntimeEnvironment()
	 * @generated
	 */
	int EXTENDED_RUNTIME_ENVIRONMENT = 14;

	/**
	 * The feature id for the '<em><b>Extended Runtime Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_RUNTIME_ENVIRONMENT__EXTENDED_RUNTIME_ENVIRONMENT = 0;

	/**
	 * The number of structural features of the '<em>Extended Runtime Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_RUNTIME_ENVIRONMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extended Runtime Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_RUNTIME_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ModuleFilterSpecifierImpl <em>Module Filter Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ModuleFilterSpecifierImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getModuleFilterSpecifier()
	 * @generated
	 */
	int MODULE_FILTER_SPECIFIER = 17;

	/**
	 * The feature id for the '<em><b>Module Specifier With Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FILTER_SPECIFIER__MODULE_SPECIFIER_WITH_WILDCARD = 0;

	/**
	 * The feature id for the '<em><b>Source Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FILTER_SPECIFIER__SOURCE_PATH = 1;

	/**
	 * The number of structural features of the '<em>Module Filter Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FILTER_SPECIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module Filter Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FILTER_SPECIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.RuntimeProjectDependencyImpl <em>Runtime Project Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.RuntimeProjectDependencyImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getRuntimeProjectDependency()
	 * @generated
	 */
	int RUNTIME_PROJECT_DEPENDENCY = 18;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROJECT_DEPENDENCY__PROJECT = SIMPLE_PROJECT_DEPENDENCY__PROJECT;

	/**
	 * The number of structural features of the '<em>Runtime Project Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROJECT_DEPENDENCY_FEATURE_COUNT = SIMPLE_PROJECT_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROJECT_DEPENDENCY___GET_SCOPE = SIMPLE_PROJECT_DEPENDENCY___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Runtime Project Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROJECT_DEPENDENCY_OPERATION_COUNT = SIMPLE_PROJECT_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.RequiredRuntimeLibraryDependencyImpl <em>Required Runtime Library Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.RequiredRuntimeLibraryDependencyImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getRequiredRuntimeLibraryDependency()
	 * @generated
	 */
	int REQUIRED_RUNTIME_LIBRARY_DEPENDENCY = 19;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RUNTIME_LIBRARY_DEPENDENCY__PROJECT = RUNTIME_PROJECT_DEPENDENCY__PROJECT;

	/**
	 * The number of structural features of the '<em>Required Runtime Library Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RUNTIME_LIBRARY_DEPENDENCY_FEATURE_COUNT = RUNTIME_PROJECT_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RUNTIME_LIBRARY_DEPENDENCY___GET_SCOPE = RUNTIME_PROJECT_DEPENDENCY___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Required Runtime Library Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RUNTIME_LIBRARY_DEPENDENCY_OPERATION_COUNT = RUNTIME_PROJECT_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ProvidedRuntimeLibraryDependencyImpl <em>Provided Runtime Library Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ProvidedRuntimeLibraryDependencyImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProvidedRuntimeLibraryDependency()
	 * @generated
	 */
	int PROVIDED_RUNTIME_LIBRARY_DEPENDENCY = 20;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_RUNTIME_LIBRARY_DEPENDENCY__PROJECT = RUNTIME_PROJECT_DEPENDENCY__PROJECT;

	/**
	 * The number of structural features of the '<em>Provided Runtime Library Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_RUNTIME_LIBRARY_DEPENDENCY_FEATURE_COUNT = RUNTIME_PROJECT_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_RUNTIME_LIBRARY_DEPENDENCY___GET_SCOPE = RUNTIME_PROJECT_DEPENDENCY___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Provided Runtime Library Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_RUNTIME_LIBRARY_DEPENDENCY_OPERATION_COUNT = RUNTIME_PROJECT_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.ProjectDependencyImpl <em>Project Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.ProjectDependencyImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectDependency()
	 * @generated
	 */
	int PROJECT_DEPENDENCY = 21;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPENDENCY__PROJECT = SIMPLE_PROJECT_DEPENDENCY__PROJECT;

	/**
	 * The feature id for the '<em><b>Version Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPENDENCY__VERSION_CONSTRAINT = SIMPLE_PROJECT_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declared Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPENDENCY__DECLARED_SCOPE = SIMPLE_PROJECT_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPENDENCY_FEATURE_COUNT = SIMPLE_PROJECT_DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPENDENCY___GET_SCOPE = SIMPLE_PROJECT_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPENDENCY_OPERATION_COUNT = SIMPLE_PROJECT_DEPENDENCY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.impl.VersionConstraintImpl <em>Version Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.impl.VersionConstraintImpl
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getVersionConstraint()
	 * @generated
	 */
	int VERSION_CONSTRAINT = 22;

	/**
	 * The feature id for the '<em><b>Excl Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONSTRAINT__EXCL_LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Lower Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONSTRAINT__LOWER_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Excl Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONSTRAINT__EXCL_UPPER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Upper Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONSTRAINT__UPPER_VERSION = 3;

	/**
	 * The number of structural features of the '<em>Version Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Version Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.ProjectType <em>Project Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.ProjectType
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectType()
	 * @generated
	 */
	int PROJECT_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.SourceFragmentType <em>Source Fragment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.SourceFragmentType
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getSourceFragmentType()
	 * @generated
	 */
	int SOURCE_FRAGMENT_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.ModuleFilterType <em>Module Filter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.ModuleFilterType
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getModuleFilterType()
	 * @generated
	 */
	int MODULE_FILTER_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.ProjectDependencyScope <em>Project Dependency Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.ProjectDependencyScope
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectDependencyScope()
	 * @generated
	 */
	int PROJECT_DEPENDENCY_SCOPE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.n4js.n4mf.ModuleLoader <em>Module Loader</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.n4js.n4mf.ModuleLoader
	 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getModuleLoader()
	 * @generated
	 */
	int MODULE_LOADER = 27;


	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ProjectDescription <em>Project Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Description</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription
	 * @generated
	 */
	EClass getProjectDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ProjectDescription#getVendorName <em>Vendor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Name</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getVendorName()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EAttribute getProjectDescription_VendorName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDescription#getProjectVersion <em>Project Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project Version</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getProjectVersion()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_ProjectVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ProjectDescription#getProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Type</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getProjectType()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EAttribute getProjectDescription_ProjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ProjectDescription#getMainModule <em>Main Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Module</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getMainModule()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EAttribute getProjectDescription_MainModule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDescription#getExtendedRuntimeEnvironment <em>Extended Runtime Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Runtime Environment</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getExtendedRuntimeEnvironment()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_ExtendedRuntimeEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDescription#getProvidedRuntimeLibraries <em>Provided Runtime Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Runtime Libraries</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getProvidedRuntimeLibraries()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_ProvidedRuntimeLibraries();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDescription#getRequiredRuntimeLibraries <em>Required Runtime Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Runtime Libraries</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getRequiredRuntimeLibraries()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_RequiredRuntimeLibraries();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDescription#getProjectDependencies <em>Project Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project Dependencies</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getProjectDependencies()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_ProjectDependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ProjectDescription#getImplementationId <em>Implementation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Id</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getImplementationId()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EAttribute getProjectDescription_ImplementationId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDescription#getImplementedProjects <em>Implemented Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implemented Projects</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getImplementedProjects()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_ImplementedProjects();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDescription#getInitModules <em>Init Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Modules</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getInitModules()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_InitModules();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDescription#getExecModule <em>Exec Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exec Module</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getExecModule()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_ExecModule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ProjectDescription#getOutputPath <em>Output Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Path</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getOutputPath()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EAttribute getProjectDescription_OutputPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.n4js.n4mf.ProjectDescription#getLibraryPaths <em>Library Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Library Paths</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getLibraryPaths()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EAttribute getProjectDescription_LibraryPaths();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.n4js.n4mf.ProjectDescription#getResourcePaths <em>Resource Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Paths</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getResourcePaths()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EAttribute getProjectDescription_ResourcePaths();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.n4js.n4mf.ProjectDescription#getSourceFragment <em>Source Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Fragment</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getSourceFragment()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_SourceFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.n4js.n4mf.ProjectDescription#getModuleFilters <em>Module Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Filters</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getModuleFilters()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_ModuleFilters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDescription#getTestedProjects <em>Tested Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tested Projects</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getTestedProjects()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EReference getProjectDescription_TestedProjects();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ProjectDescription#getModuleLoader <em>Module Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Loader</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getModuleLoader()
	 * @see #getProjectDescription()
	 * @generated
	 */
	EAttribute getProjectDescription_ModuleLoader();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.ProjectDescription#getAllTestedProjects() <em>Get All Tested Projects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Tested Projects</em>' operation.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getAllTestedProjects()
	 * @generated
	 */
	EOperation getProjectDescription__GetAllTestedProjects();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.ProjectDescription#getAllInitModules() <em>Get All Init Modules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Init Modules</em>' operation.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getAllInitModules()
	 * @generated
	 */
	EOperation getProjectDescription__GetAllInitModules();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.ProjectDescription#getAllImplementedProjects() <em>Get All Implemented Projects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Implemented Projects</em>' operation.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getAllImplementedProjects()
	 * @generated
	 */
	EOperation getProjectDescription__GetAllImplementedProjects();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.ProjectDescription#getAllProjectDependencies() <em>Get All Project Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Project Dependencies</em>' operation.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getAllProjectDependencies()
	 * @generated
	 */
	EOperation getProjectDescription__GetAllProjectDependencies();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.ProjectDescription#getAllProvidedRuntimeLibraries() <em>Get All Provided Runtime Libraries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Provided Runtime Libraries</em>' operation.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getAllProvidedRuntimeLibraries()
	 * @generated
	 */
	EOperation getProjectDescription__GetAllProvidedRuntimeLibraries();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.ProjectDescription#getAllRequiredRuntimeLibraries() <em>Get All Required Runtime Libraries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Required Runtime Libraries</em>' operation.
	 * @see org.eclipse.n4js.n4mf.ProjectDescription#getAllRequiredRuntimeLibraries()
	 * @generated
	 */
	EOperation getProjectDescription__GetAllRequiredRuntimeLibraries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ExecModule <em>Exec Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Module</em>'.
	 * @see org.eclipse.n4js.n4mf.ExecModule
	 * @generated
	 */
	EClass getExecModule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ExecModule#getExecModule <em>Exec Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exec Module</em>'.
	 * @see org.eclipse.n4js.n4mf.ExecModule#getExecModule()
	 * @see #getExecModule()
	 * @generated
	 */
	EReference getExecModule_ExecModule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.TestedProjects <em>Tested Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tested Projects</em>'.
	 * @see org.eclipse.n4js.n4mf.TestedProjects
	 * @generated
	 */
	EClass getTestedProjects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.n4js.n4mf.TestedProjects#getTestedProjects <em>Tested Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tested Projects</em>'.
	 * @see org.eclipse.n4js.n4mf.TestedProjects#getTestedProjects()
	 * @see #getTestedProjects()
	 * @generated
	 */
	EReference getTestedProjects_TestedProjects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.InitModules <em>Init Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Modules</em>'.
	 * @see org.eclipse.n4js.n4mf.InitModules
	 * @generated
	 */
	EClass getInitModules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.n4js.n4mf.InitModules#getInitModules <em>Init Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Modules</em>'.
	 * @see org.eclipse.n4js.n4mf.InitModules#getInitModules()
	 * @see #getInitModules()
	 * @generated
	 */
	EReference getInitModules_InitModules();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ImplementedProjects <em>Implemented Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implemented Projects</em>'.
	 * @see org.eclipse.n4js.n4mf.ImplementedProjects
	 * @generated
	 */
	EClass getImplementedProjects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.n4js.n4mf.ImplementedProjects#getImplementedProjects <em>Implemented Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implemented Projects</em>'.
	 * @see org.eclipse.n4js.n4mf.ImplementedProjects#getImplementedProjects()
	 * @see #getImplementedProjects()
	 * @generated
	 */
	EReference getImplementedProjects_ImplementedProjects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ProjectDependencies <em>Project Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Dependencies</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDependencies
	 * @generated
	 */
	EClass getProjectDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.n4js.n4mf.ProjectDependencies#getProjectDependencies <em>Project Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Dependencies</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDependencies#getProjectDependencies()
	 * @see #getProjectDependencies()
	 * @generated
	 */
	EReference getProjectDependencies_ProjectDependencies();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ProvidedRuntimeLibraries <em>Provided Runtime Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Runtime Libraries</em>'.
	 * @see org.eclipse.n4js.n4mf.ProvidedRuntimeLibraries
	 * @generated
	 */
	EClass getProvidedRuntimeLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.n4js.n4mf.ProvidedRuntimeLibraries#getProvidedRuntimeLibraries <em>Provided Runtime Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Runtime Libraries</em>'.
	 * @see org.eclipse.n4js.n4mf.ProvidedRuntimeLibraries#getProvidedRuntimeLibraries()
	 * @see #getProvidedRuntimeLibraries()
	 * @generated
	 */
	EReference getProvidedRuntimeLibraries_ProvidedRuntimeLibraries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.RequiredRuntimeLibraries <em>Required Runtime Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Runtime Libraries</em>'.
	 * @see org.eclipse.n4js.n4mf.RequiredRuntimeLibraries
	 * @generated
	 */
	EClass getRequiredRuntimeLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.n4js.n4mf.RequiredRuntimeLibraries#getRequiredRuntimeLibraries <em>Required Runtime Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Runtime Libraries</em>'.
	 * @see org.eclipse.n4js.n4mf.RequiredRuntimeLibraries#getRequiredRuntimeLibraries()
	 * @see #getRequiredRuntimeLibraries()
	 * @generated
	 */
	EReference getRequiredRuntimeLibraries_RequiredRuntimeLibraries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.SimpleProjectDescription <em>Simple Project Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Project Description</em>'.
	 * @see org.eclipse.n4js.n4mf.SimpleProjectDescription
	 * @generated
	 */
	EClass getSimpleProjectDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.SimpleProjectDescription#getDeclaredVendorId <em>Declared Vendor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Vendor Id</em>'.
	 * @see org.eclipse.n4js.n4mf.SimpleProjectDescription#getDeclaredVendorId()
	 * @see #getSimpleProjectDescription()
	 * @generated
	 */
	EAttribute getSimpleProjectDescription_DeclaredVendorId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.SimpleProjectDescription#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.eclipse.n4js.n4mf.SimpleProjectDescription#getProjectId()
	 * @see #getSimpleProjectDescription()
	 * @generated
	 */
	EAttribute getSimpleProjectDescription_ProjectId();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.SimpleProjectDescription#getVendorId() <em>Get Vendor Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vendor Id</em>' operation.
	 * @see org.eclipse.n4js.n4mf.SimpleProjectDescription#getVendorId()
	 * @generated
	 */
	EOperation getSimpleProjectDescription__GetVendorId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.TestedProject <em>Tested Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tested Project</em>'.
	 * @see org.eclipse.n4js.n4mf.TestedProject
	 * @generated
	 */
	EClass getTestedProject();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.TestedProject#getVersionConstraint <em>Version Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Constraint</em>'.
	 * @see org.eclipse.n4js.n4mf.TestedProject#getVersionConstraint()
	 * @see #getTestedProject()
	 * @generated
	 */
	EReference getTestedProject_VersionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.TestedProject#getDeclaredScope <em>Declared Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Scope</em>'.
	 * @see org.eclipse.n4js.n4mf.TestedProject#getDeclaredScope()
	 * @see #getTestedProject()
	 * @generated
	 */
	EAttribute getTestedProject_DeclaredScope();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.DeclaredVersion <em>Declared Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Version</em>'.
	 * @see org.eclipse.n4js.n4mf.DeclaredVersion
	 * @generated
	 */
	EClass getDeclaredVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.DeclaredVersion#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see org.eclipse.n4js.n4mf.DeclaredVersion#getMajor()
	 * @see #getDeclaredVersion()
	 * @generated
	 */
	EAttribute getDeclaredVersion_Major();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.DeclaredVersion#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see org.eclipse.n4js.n4mf.DeclaredVersion#getMinor()
	 * @see #getDeclaredVersion()
	 * @generated
	 */
	EAttribute getDeclaredVersion_Minor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.DeclaredVersion#getMicro <em>Micro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Micro</em>'.
	 * @see org.eclipse.n4js.n4mf.DeclaredVersion#getMicro()
	 * @see #getDeclaredVersion()
	 * @generated
	 */
	EAttribute getDeclaredVersion_Micro();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.DeclaredVersion#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.eclipse.n4js.n4mf.DeclaredVersion#getQualifier()
	 * @see #getDeclaredVersion()
	 * @generated
	 */
	EAttribute getDeclaredVersion_Qualifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.SourceFragment <em>Source Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Fragment</em>'.
	 * @see org.eclipse.n4js.n4mf.SourceFragment
	 * @generated
	 */
	EClass getSourceFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.SourceFragment#getSourceFragmentType <em>Source Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Fragment Type</em>'.
	 * @see org.eclipse.n4js.n4mf.SourceFragment#getSourceFragmentType()
	 * @see #getSourceFragment()
	 * @generated
	 */
	EAttribute getSourceFragment_SourceFragmentType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.n4js.n4mf.SourceFragment#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see org.eclipse.n4js.n4mf.SourceFragment#getPaths()
	 * @see #getSourceFragment()
	 * @generated
	 */
	EAttribute getSourceFragment_Paths();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.SourceFragment#compareByFragmentType(org.eclipse.n4js.n4mf.SourceFragment) <em>Compare By Fragment Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare By Fragment Type</em>' operation.
	 * @see org.eclipse.n4js.n4mf.SourceFragment#compareByFragmentType(org.eclipse.n4js.n4mf.SourceFragment)
	 * @generated
	 */
	EOperation getSourceFragment__CompareByFragmentType__SourceFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ModuleFilter <em>Module Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Filter</em>'.
	 * @see org.eclipse.n4js.n4mf.ModuleFilter
	 * @generated
	 */
	EClass getModuleFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ModuleFilter#getModuleFilterType <em>Module Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Filter Type</em>'.
	 * @see org.eclipse.n4js.n4mf.ModuleFilter#getModuleFilterType()
	 * @see #getModuleFilter()
	 * @generated
	 */
	EAttribute getModuleFilter_ModuleFilterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.n4js.n4mf.ModuleFilter#getModuleSpecifiers <em>Module Specifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Specifiers</em>'.
	 * @see org.eclipse.n4js.n4mf.ModuleFilter#getModuleSpecifiers()
	 * @see #getModuleFilter()
	 * @generated
	 */
	EReference getModuleFilter_ModuleSpecifiers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.BootstrapModule <em>Bootstrap Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bootstrap Module</em>'.
	 * @see org.eclipse.n4js.n4mf.BootstrapModule
	 * @generated
	 */
	EClass getBootstrapModule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.BootstrapModule#getModuleSpecifierWithWildcard <em>Module Specifier With Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Specifier With Wildcard</em>'.
	 * @see org.eclipse.n4js.n4mf.BootstrapModule#getModuleSpecifierWithWildcard()
	 * @see #getBootstrapModule()
	 * @generated
	 */
	EAttribute getBootstrapModule_ModuleSpecifierWithWildcard();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.BootstrapModule#getSourcePath <em>Source Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Path</em>'.
	 * @see org.eclipse.n4js.n4mf.BootstrapModule#getSourcePath()
	 * @see #getBootstrapModule()
	 * @generated
	 */
	EAttribute getBootstrapModule_SourcePath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ExtendedRuntimeEnvironment <em>Extended Runtime Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Runtime Environment</em>'.
	 * @see org.eclipse.n4js.n4mf.ExtendedRuntimeEnvironment
	 * @generated
	 */
	EClass getExtendedRuntimeEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ExtendedRuntimeEnvironment#getExtendedRuntimeEnvironment <em>Extended Runtime Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Runtime Environment</em>'.
	 * @see org.eclipse.n4js.n4mf.ExtendedRuntimeEnvironment#getExtendedRuntimeEnvironment()
	 * @see #getExtendedRuntimeEnvironment()
	 * @generated
	 */
	EReference getExtendedRuntimeEnvironment_ExtendedRuntimeEnvironment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ProjectReference <em>Project Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Reference</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectReference
	 * @generated
	 */
	EClass getProjectReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectReference#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectReference#getProject()
	 * @see #getProjectReference()
	 * @generated
	 */
	EReference getProjectReference_Project();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.SimpleProjectDependency <em>Simple Project Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Project Dependency</em>'.
	 * @see org.eclipse.n4js.n4mf.SimpleProjectDependency
	 * @generated
	 */
	EClass getSimpleProjectDependency();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.SimpleProjectDependency#getScope() <em>Get Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Scope</em>' operation.
	 * @see org.eclipse.n4js.n4mf.SimpleProjectDependency#getScope()
	 * @generated
	 */
	EOperation getSimpleProjectDependency__GetScope();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ModuleFilterSpecifier <em>Module Filter Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Filter Specifier</em>'.
	 * @see org.eclipse.n4js.n4mf.ModuleFilterSpecifier
	 * @generated
	 */
	EClass getModuleFilterSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ModuleFilterSpecifier#getModuleSpecifierWithWildcard <em>Module Specifier With Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Specifier With Wildcard</em>'.
	 * @see org.eclipse.n4js.n4mf.ModuleFilterSpecifier#getModuleSpecifierWithWildcard()
	 * @see #getModuleFilterSpecifier()
	 * @generated
	 */
	EAttribute getModuleFilterSpecifier_ModuleSpecifierWithWildcard();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ModuleFilterSpecifier#getSourcePath <em>Source Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Path</em>'.
	 * @see org.eclipse.n4js.n4mf.ModuleFilterSpecifier#getSourcePath()
	 * @see #getModuleFilterSpecifier()
	 * @generated
	 */
	EAttribute getModuleFilterSpecifier_SourcePath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.RuntimeProjectDependency <em>Runtime Project Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Project Dependency</em>'.
	 * @see org.eclipse.n4js.n4mf.RuntimeProjectDependency
	 * @generated
	 */
	EClass getRuntimeProjectDependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.RequiredRuntimeLibraryDependency <em>Required Runtime Library Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Runtime Library Dependency</em>'.
	 * @see org.eclipse.n4js.n4mf.RequiredRuntimeLibraryDependency
	 * @generated
	 */
	EClass getRequiredRuntimeLibraryDependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ProvidedRuntimeLibraryDependency <em>Provided Runtime Library Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Runtime Library Dependency</em>'.
	 * @see org.eclipse.n4js.n4mf.ProvidedRuntimeLibraryDependency
	 * @generated
	 */
	EClass getProvidedRuntimeLibraryDependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.ProjectDependency <em>Project Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Dependency</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDependency
	 * @generated
	 */
	EClass getProjectDependency();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.ProjectDependency#getVersionConstraint <em>Version Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Constraint</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDependency#getVersionConstraint()
	 * @see #getProjectDependency()
	 * @generated
	 */
	EReference getProjectDependency_VersionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.ProjectDependency#getDeclaredScope <em>Declared Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Scope</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDependency#getDeclaredScope()
	 * @see #getProjectDependency()
	 * @generated
	 */
	EAttribute getProjectDependency_DeclaredScope();

	/**
	 * Returns the meta object for the '{@link org.eclipse.n4js.n4mf.ProjectDependency#getScope() <em>Get Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Scope</em>' operation.
	 * @see org.eclipse.n4js.n4mf.ProjectDependency#getScope()
	 * @generated
	 */
	EOperation getProjectDependency__GetScope();

	/**
	 * Returns the meta object for class '{@link org.eclipse.n4js.n4mf.VersionConstraint <em>Version Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Constraint</em>'.
	 * @see org.eclipse.n4js.n4mf.VersionConstraint
	 * @generated
	 */
	EClass getVersionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.VersionConstraint#isExclLowerBound <em>Excl Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excl Lower Bound</em>'.
	 * @see org.eclipse.n4js.n4mf.VersionConstraint#isExclLowerBound()
	 * @see #getVersionConstraint()
	 * @generated
	 */
	EAttribute getVersionConstraint_ExclLowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.VersionConstraint#getLowerVersion <em>Lower Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Version</em>'.
	 * @see org.eclipse.n4js.n4mf.VersionConstraint#getLowerVersion()
	 * @see #getVersionConstraint()
	 * @generated
	 */
	EReference getVersionConstraint_LowerVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.n4js.n4mf.VersionConstraint#isExclUpperBound <em>Excl Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excl Upper Bound</em>'.
	 * @see org.eclipse.n4js.n4mf.VersionConstraint#isExclUpperBound()
	 * @see #getVersionConstraint()
	 * @generated
	 */
	EAttribute getVersionConstraint_ExclUpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.n4js.n4mf.VersionConstraint#getUpperVersion <em>Upper Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Version</em>'.
	 * @see org.eclipse.n4js.n4mf.VersionConstraint#getUpperVersion()
	 * @see #getVersionConstraint()
	 * @generated
	 */
	EReference getVersionConstraint_UpperVersion();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.n4js.n4mf.ProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Project Type</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectType
	 * @generated
	 */
	EEnum getProjectType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.n4js.n4mf.SourceFragmentType <em>Source Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Fragment Type</em>'.
	 * @see org.eclipse.n4js.n4mf.SourceFragmentType
	 * @generated
	 */
	EEnum getSourceFragmentType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.n4js.n4mf.ModuleFilterType <em>Module Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Filter Type</em>'.
	 * @see org.eclipse.n4js.n4mf.ModuleFilterType
	 * @generated
	 */
	EEnum getModuleFilterType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.n4js.n4mf.ProjectDependencyScope <em>Project Dependency Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Project Dependency Scope</em>'.
	 * @see org.eclipse.n4js.n4mf.ProjectDependencyScope
	 * @generated
	 */
	EEnum getProjectDependencyScope();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.n4js.n4mf.ModuleLoader <em>Module Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Loader</em>'.
	 * @see org.eclipse.n4js.n4mf.ModuleLoader
	 * @generated
	 */
	EEnum getModuleLoader();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	N4mfFactory getN4mfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ProjectDescriptionImpl <em>Project Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ProjectDescriptionImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectDescription()
		 * @generated
		 */
		EClass PROJECT_DESCRIPTION = eINSTANCE.getProjectDescription();

		/**
		 * The meta object literal for the '<em><b>Vendor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DESCRIPTION__VENDOR_NAME = eINSTANCE.getProjectDescription_VendorName();

		/**
		 * The meta object literal for the '<em><b>Project Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__PROJECT_VERSION = eINSTANCE.getProjectDescription_ProjectVersion();

		/**
		 * The meta object literal for the '<em><b>Project Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DESCRIPTION__PROJECT_TYPE = eINSTANCE.getProjectDescription_ProjectType();

		/**
		 * The meta object literal for the '<em><b>Main Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DESCRIPTION__MAIN_MODULE = eINSTANCE.getProjectDescription_MainModule();

		/**
		 * The meta object literal for the '<em><b>Extended Runtime Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__EXTENDED_RUNTIME_ENVIRONMENT = eINSTANCE.getProjectDescription_ExtendedRuntimeEnvironment();

		/**
		 * The meta object literal for the '<em><b>Provided Runtime Libraries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__PROVIDED_RUNTIME_LIBRARIES = eINSTANCE.getProjectDescription_ProvidedRuntimeLibraries();

		/**
		 * The meta object literal for the '<em><b>Required Runtime Libraries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__REQUIRED_RUNTIME_LIBRARIES = eINSTANCE.getProjectDescription_RequiredRuntimeLibraries();

		/**
		 * The meta object literal for the '<em><b>Project Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__PROJECT_DEPENDENCIES = eINSTANCE.getProjectDescription_ProjectDependencies();

		/**
		 * The meta object literal for the '<em><b>Implementation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DESCRIPTION__IMPLEMENTATION_ID = eINSTANCE.getProjectDescription_ImplementationId();

		/**
		 * The meta object literal for the '<em><b>Implemented Projects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__IMPLEMENTED_PROJECTS = eINSTANCE.getProjectDescription_ImplementedProjects();

		/**
		 * The meta object literal for the '<em><b>Init Modules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__INIT_MODULES = eINSTANCE.getProjectDescription_InitModules();

		/**
		 * The meta object literal for the '<em><b>Exec Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__EXEC_MODULE = eINSTANCE.getProjectDescription_ExecModule();

		/**
		 * The meta object literal for the '<em><b>Output Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DESCRIPTION__OUTPUT_PATH = eINSTANCE.getProjectDescription_OutputPath();

		/**
		 * The meta object literal for the '<em><b>Library Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DESCRIPTION__LIBRARY_PATHS = eINSTANCE.getProjectDescription_LibraryPaths();

		/**
		 * The meta object literal for the '<em><b>Resource Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DESCRIPTION__RESOURCE_PATHS = eINSTANCE.getProjectDescription_ResourcePaths();

		/**
		 * The meta object literal for the '<em><b>Source Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__SOURCE_FRAGMENT = eINSTANCE.getProjectDescription_SourceFragment();

		/**
		 * The meta object literal for the '<em><b>Module Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__MODULE_FILTERS = eINSTANCE.getProjectDescription_ModuleFilters();

		/**
		 * The meta object literal for the '<em><b>Tested Projects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DESCRIPTION__TESTED_PROJECTS = eINSTANCE.getProjectDescription_TestedProjects();

		/**
		 * The meta object literal for the '<em><b>Module Loader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DESCRIPTION__MODULE_LOADER = eINSTANCE.getProjectDescription_ModuleLoader();

		/**
		 * The meta object literal for the '<em><b>Get All Tested Projects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT_DESCRIPTION___GET_ALL_TESTED_PROJECTS = eINSTANCE.getProjectDescription__GetAllTestedProjects();

		/**
		 * The meta object literal for the '<em><b>Get All Init Modules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT_DESCRIPTION___GET_ALL_INIT_MODULES = eINSTANCE.getProjectDescription__GetAllInitModules();

		/**
		 * The meta object literal for the '<em><b>Get All Implemented Projects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT_DESCRIPTION___GET_ALL_IMPLEMENTED_PROJECTS = eINSTANCE.getProjectDescription__GetAllImplementedProjects();

		/**
		 * The meta object literal for the '<em><b>Get All Project Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT_DESCRIPTION___GET_ALL_PROJECT_DEPENDENCIES = eINSTANCE.getProjectDescription__GetAllProjectDependencies();

		/**
		 * The meta object literal for the '<em><b>Get All Provided Runtime Libraries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT_DESCRIPTION___GET_ALL_PROVIDED_RUNTIME_LIBRARIES = eINSTANCE.getProjectDescription__GetAllProvidedRuntimeLibraries();

		/**
		 * The meta object literal for the '<em><b>Get All Required Runtime Libraries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT_DESCRIPTION___GET_ALL_REQUIRED_RUNTIME_LIBRARIES = eINSTANCE.getProjectDescription__GetAllRequiredRuntimeLibraries();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ExecModuleImpl <em>Exec Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ExecModuleImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getExecModule()
		 * @generated
		 */
		EClass EXEC_MODULE = eINSTANCE.getExecModule();

		/**
		 * The meta object literal for the '<em><b>Exec Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_MODULE__EXEC_MODULE = eINSTANCE.getExecModule_ExecModule();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.TestedProjectsImpl <em>Tested Projects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.TestedProjectsImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getTestedProjects()
		 * @generated
		 */
		EClass TESTED_PROJECTS = eINSTANCE.getTestedProjects();

		/**
		 * The meta object literal for the '<em><b>Tested Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTED_PROJECTS__TESTED_PROJECTS = eINSTANCE.getTestedProjects_TestedProjects();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.InitModulesImpl <em>Init Modules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.InitModulesImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getInitModules()
		 * @generated
		 */
		EClass INIT_MODULES = eINSTANCE.getInitModules();

		/**
		 * The meta object literal for the '<em><b>Init Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_MODULES__INIT_MODULES = eINSTANCE.getInitModules_InitModules();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ImplementedProjectsImpl <em>Implemented Projects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ImplementedProjectsImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getImplementedProjects()
		 * @generated
		 */
		EClass IMPLEMENTED_PROJECTS = eINSTANCE.getImplementedProjects();

		/**
		 * The meta object literal for the '<em><b>Implemented Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTED_PROJECTS__IMPLEMENTED_PROJECTS = eINSTANCE.getImplementedProjects_ImplementedProjects();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ProjectDependenciesImpl <em>Project Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ProjectDependenciesImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectDependencies()
		 * @generated
		 */
		EClass PROJECT_DEPENDENCIES = eINSTANCE.getProjectDependencies();

		/**
		 * The meta object literal for the '<em><b>Project Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DEPENDENCIES__PROJECT_DEPENDENCIES = eINSTANCE.getProjectDependencies_ProjectDependencies();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ProvidedRuntimeLibrariesImpl <em>Provided Runtime Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ProvidedRuntimeLibrariesImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProvidedRuntimeLibraries()
		 * @generated
		 */
		EClass PROVIDED_RUNTIME_LIBRARIES = eINSTANCE.getProvidedRuntimeLibraries();

		/**
		 * The meta object literal for the '<em><b>Provided Runtime Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_RUNTIME_LIBRARIES__PROVIDED_RUNTIME_LIBRARIES = eINSTANCE.getProvidedRuntimeLibraries_ProvidedRuntimeLibraries();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.RequiredRuntimeLibrariesImpl <em>Required Runtime Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.RequiredRuntimeLibrariesImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getRequiredRuntimeLibraries()
		 * @generated
		 */
		EClass REQUIRED_RUNTIME_LIBRARIES = eINSTANCE.getRequiredRuntimeLibraries();

		/**
		 * The meta object literal for the '<em><b>Required Runtime Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_RUNTIME_LIBRARIES__REQUIRED_RUNTIME_LIBRARIES = eINSTANCE.getRequiredRuntimeLibraries_RequiredRuntimeLibraries();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.SimpleProjectDescriptionImpl <em>Simple Project Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.SimpleProjectDescriptionImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getSimpleProjectDescription()
		 * @generated
		 */
		EClass SIMPLE_PROJECT_DESCRIPTION = eINSTANCE.getSimpleProjectDescription();

		/**
		 * The meta object literal for the '<em><b>Declared Vendor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PROJECT_DESCRIPTION__DECLARED_VENDOR_ID = eINSTANCE.getSimpleProjectDescription_DeclaredVendorId();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PROJECT_DESCRIPTION__PROJECT_ID = eINSTANCE.getSimpleProjectDescription_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Get Vendor Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_PROJECT_DESCRIPTION___GET_VENDOR_ID = eINSTANCE.getSimpleProjectDescription__GetVendorId();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.TestedProjectImpl <em>Tested Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.TestedProjectImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getTestedProject()
		 * @generated
		 */
		EClass TESTED_PROJECT = eINSTANCE.getTestedProject();

		/**
		 * The meta object literal for the '<em><b>Version Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTED_PROJECT__VERSION_CONSTRAINT = eINSTANCE.getTestedProject_VersionConstraint();

		/**
		 * The meta object literal for the '<em><b>Declared Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTED_PROJECT__DECLARED_SCOPE = eINSTANCE.getTestedProject_DeclaredScope();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.DeclaredVersionImpl <em>Declared Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.DeclaredVersionImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getDeclaredVersion()
		 * @generated
		 */
		EClass DECLARED_VERSION = eINSTANCE.getDeclaredVersion();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED_VERSION__MAJOR = eINSTANCE.getDeclaredVersion_Major();

		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED_VERSION__MINOR = eINSTANCE.getDeclaredVersion_Minor();

		/**
		 * The meta object literal for the '<em><b>Micro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED_VERSION__MICRO = eINSTANCE.getDeclaredVersion_Micro();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED_VERSION__QUALIFIER = eINSTANCE.getDeclaredVersion_Qualifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.SourceFragmentImpl <em>Source Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.SourceFragmentImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getSourceFragment()
		 * @generated
		 */
		EClass SOURCE_FRAGMENT = eINSTANCE.getSourceFragment();

		/**
		 * The meta object literal for the '<em><b>Source Fragment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FRAGMENT__SOURCE_FRAGMENT_TYPE = eINSTANCE.getSourceFragment_SourceFragmentType();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FRAGMENT__PATHS = eINSTANCE.getSourceFragment_Paths();

		/**
		 * The meta object literal for the '<em><b>Compare By Fragment Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_FRAGMENT___COMPARE_BY_FRAGMENT_TYPE__SOURCEFRAGMENT = eINSTANCE.getSourceFragment__CompareByFragmentType__SourceFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ModuleFilterImpl <em>Module Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ModuleFilterImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getModuleFilter()
		 * @generated
		 */
		EClass MODULE_FILTER = eINSTANCE.getModuleFilter();

		/**
		 * The meta object literal for the '<em><b>Module Filter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_FILTER__MODULE_FILTER_TYPE = eINSTANCE.getModuleFilter_ModuleFilterType();

		/**
		 * The meta object literal for the '<em><b>Module Specifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_FILTER__MODULE_SPECIFIERS = eINSTANCE.getModuleFilter_ModuleSpecifiers();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.BootstrapModuleImpl <em>Bootstrap Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.BootstrapModuleImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getBootstrapModule()
		 * @generated
		 */
		EClass BOOTSTRAP_MODULE = eINSTANCE.getBootstrapModule();

		/**
		 * The meta object literal for the '<em><b>Module Specifier With Wildcard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAP_MODULE__MODULE_SPECIFIER_WITH_WILDCARD = eINSTANCE.getBootstrapModule_ModuleSpecifierWithWildcard();

		/**
		 * The meta object literal for the '<em><b>Source Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAP_MODULE__SOURCE_PATH = eINSTANCE.getBootstrapModule_SourcePath();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ExtendedRuntimeEnvironmentImpl <em>Extended Runtime Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ExtendedRuntimeEnvironmentImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getExtendedRuntimeEnvironment()
		 * @generated
		 */
		EClass EXTENDED_RUNTIME_ENVIRONMENT = eINSTANCE.getExtendedRuntimeEnvironment();

		/**
		 * The meta object literal for the '<em><b>Extended Runtime Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_RUNTIME_ENVIRONMENT__EXTENDED_RUNTIME_ENVIRONMENT = eINSTANCE.getExtendedRuntimeEnvironment_ExtendedRuntimeEnvironment();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ProjectReferenceImpl <em>Project Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ProjectReferenceImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectReference()
		 * @generated
		 */
		EClass PROJECT_REFERENCE = eINSTANCE.getProjectReference();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_REFERENCE__PROJECT = eINSTANCE.getProjectReference_Project();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.SimpleProjectDependencyImpl <em>Simple Project Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.SimpleProjectDependencyImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getSimpleProjectDependency()
		 * @generated
		 */
		EClass SIMPLE_PROJECT_DEPENDENCY = eINSTANCE.getSimpleProjectDependency();

		/**
		 * The meta object literal for the '<em><b>Get Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_PROJECT_DEPENDENCY___GET_SCOPE = eINSTANCE.getSimpleProjectDependency__GetScope();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ModuleFilterSpecifierImpl <em>Module Filter Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ModuleFilterSpecifierImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getModuleFilterSpecifier()
		 * @generated
		 */
		EClass MODULE_FILTER_SPECIFIER = eINSTANCE.getModuleFilterSpecifier();

		/**
		 * The meta object literal for the '<em><b>Module Specifier With Wildcard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_FILTER_SPECIFIER__MODULE_SPECIFIER_WITH_WILDCARD = eINSTANCE.getModuleFilterSpecifier_ModuleSpecifierWithWildcard();

		/**
		 * The meta object literal for the '<em><b>Source Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_FILTER_SPECIFIER__SOURCE_PATH = eINSTANCE.getModuleFilterSpecifier_SourcePath();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.RuntimeProjectDependencyImpl <em>Runtime Project Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.RuntimeProjectDependencyImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getRuntimeProjectDependency()
		 * @generated
		 */
		EClass RUNTIME_PROJECT_DEPENDENCY = eINSTANCE.getRuntimeProjectDependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.RequiredRuntimeLibraryDependencyImpl <em>Required Runtime Library Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.RequiredRuntimeLibraryDependencyImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getRequiredRuntimeLibraryDependency()
		 * @generated
		 */
		EClass REQUIRED_RUNTIME_LIBRARY_DEPENDENCY = eINSTANCE.getRequiredRuntimeLibraryDependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ProvidedRuntimeLibraryDependencyImpl <em>Provided Runtime Library Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ProvidedRuntimeLibraryDependencyImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProvidedRuntimeLibraryDependency()
		 * @generated
		 */
		EClass PROVIDED_RUNTIME_LIBRARY_DEPENDENCY = eINSTANCE.getProvidedRuntimeLibraryDependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.ProjectDependencyImpl <em>Project Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.ProjectDependencyImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectDependency()
		 * @generated
		 */
		EClass PROJECT_DEPENDENCY = eINSTANCE.getProjectDependency();

		/**
		 * The meta object literal for the '<em><b>Version Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DEPENDENCY__VERSION_CONSTRAINT = eINSTANCE.getProjectDependency_VersionConstraint();

		/**
		 * The meta object literal for the '<em><b>Declared Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEPENDENCY__DECLARED_SCOPE = eINSTANCE.getProjectDependency_DeclaredScope();

		/**
		 * The meta object literal for the '<em><b>Get Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT_DEPENDENCY___GET_SCOPE = eINSTANCE.getProjectDependency__GetScope();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.impl.VersionConstraintImpl <em>Version Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.impl.VersionConstraintImpl
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getVersionConstraint()
		 * @generated
		 */
		EClass VERSION_CONSTRAINT = eINSTANCE.getVersionConstraint();

		/**
		 * The meta object literal for the '<em><b>Excl Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_CONSTRAINT__EXCL_LOWER_BOUND = eINSTANCE.getVersionConstraint_ExclLowerBound();

		/**
		 * The meta object literal for the '<em><b>Lower Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_CONSTRAINT__LOWER_VERSION = eINSTANCE.getVersionConstraint_LowerVersion();

		/**
		 * The meta object literal for the '<em><b>Excl Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_CONSTRAINT__EXCL_UPPER_BOUND = eINSTANCE.getVersionConstraint_ExclUpperBound();

		/**
		 * The meta object literal for the '<em><b>Upper Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_CONSTRAINT__UPPER_VERSION = eINSTANCE.getVersionConstraint_UpperVersion();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.ProjectType <em>Project Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.ProjectType
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectType()
		 * @generated
		 */
		EEnum PROJECT_TYPE = eINSTANCE.getProjectType();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.SourceFragmentType <em>Source Fragment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.SourceFragmentType
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getSourceFragmentType()
		 * @generated
		 */
		EEnum SOURCE_FRAGMENT_TYPE = eINSTANCE.getSourceFragmentType();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.ModuleFilterType <em>Module Filter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.ModuleFilterType
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getModuleFilterType()
		 * @generated
		 */
		EEnum MODULE_FILTER_TYPE = eINSTANCE.getModuleFilterType();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.ProjectDependencyScope <em>Project Dependency Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.ProjectDependencyScope
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getProjectDependencyScope()
		 * @generated
		 */
		EEnum PROJECT_DEPENDENCY_SCOPE = eINSTANCE.getProjectDependencyScope();

		/**
		 * The meta object literal for the '{@link org.eclipse.n4js.n4mf.ModuleLoader <em>Module Loader</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.n4js.n4mf.ModuleLoader
		 * @see org.eclipse.n4js.n4mf.impl.N4mfPackageImpl#getModuleLoader()
		 * @generated
		 */
		EEnum MODULE_LOADER = eINSTANCE.getModuleLoader();

	}

} //N4mfPackage
