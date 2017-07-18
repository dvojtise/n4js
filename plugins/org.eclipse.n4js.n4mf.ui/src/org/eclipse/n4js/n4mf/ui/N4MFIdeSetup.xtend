/**
 * Copyright (c) 2017 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   NumberFour AG - Initial API and implementation
 */
package org.eclipse.n4js.n4mf.ui

import com.google.inject.Guice
import org.eclipse.n4js.n4mf.N4MFRuntimeModule
import org.eclipse.n4js.n4mf.N4MFStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class N4MFIdeSetup extends N4MFStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new N4MFRuntimeModule, new N4MFIdeModule))
	}
	
}