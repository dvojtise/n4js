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
package org.eclipse.n4js.flowgraphs.tests;

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.runner.RunWith
import org.junit.Test
import org.eclipse.n4js.n4JS.Script
import org.eclipse.n4js.N4JSInjectorProvider
import static org.junit.Assert.*
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.n4js.flowgraphs.N4JSFlowAnalyses

@RunWith(XtextRunner)
@InjectWith(N4JSInjectorProvider)
/**
 */
class TypeDefsParserTest {

	@Inject extension ParseHelper<Script>;
	@Inject extension ValidationTestHelper;

	@Inject N4JSFlowAnalyses flowAnalyses;

	@Test
	def void testEmptyClass() {
		val script = '''
			function fn() {
				console.log("Hello");
			}
		'''.parse;
		script.validate;
		
		assertNotNull(script);
	}

}
