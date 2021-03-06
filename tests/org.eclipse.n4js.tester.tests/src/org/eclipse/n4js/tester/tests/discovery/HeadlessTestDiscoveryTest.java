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
package org.eclipse.n4js.tester.tests.discovery;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.getOnlyElement;
import static com.google.common.collect.Iterables.size;
import static com.google.common.collect.Lists.asList;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Maps.uniqueIndex;
import static java.io.File.separator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Injector;

import org.eclipse.n4js.N4JSGlobals;
import org.eclipse.n4js.fileextensions.FileExtensionType;
import org.eclipse.n4js.fileextensions.FileExtensionsRegistry;
import org.eclipse.n4js.internal.FileBasedWorkspace;
import org.eclipse.n4js.tester.TestDiscoveryHelper;
import org.eclipse.n4js.tester.TesterModule;
import org.eclipse.n4js.tester.domain.TestSuite;
import org.eclipse.n4js.tester.domain.TestTree;
import org.eclipse.n4js.tester.tests.InjectedModules;
import org.eclipse.n4js.tester.tests.JUnitGuiceClassRunner;
import org.eclipse.n4js.tester.tests.WithParentInjector;
import org.eclipse.n4js.n4jsx.N4JSXGlobals;
import org.eclipse.n4js.n4jsx.N4JSXStandaloneSetup;

/**
 * Class for testing the behavior of the {@link TestDiscoveryHelper} in headless mode.
 */
@RunWith(JUnitGuiceClassRunner.class)
@InjectedModules(baseModules = { TesterModule.class }, overrides = {})
public class HeadlessTestDiscoveryTest {

	private static final String RESOURCES_FOLDER = "resources";
	private static final String TEST_SRC_STRUCTURE = "path.to.the.source";
	private static final String TEST_PROJECT_NAME = "test.discovery.example.project";
	private static final String TEST_PROJECT_NAME_IDEBUG_572 = "test.discovery.example.project.idebug.572";
	private static final String TEST_CLASS_1 = "TestClass_1";
	private static final String TEST_CLASS_2 = "TestClass_2";
	private static final File TEST_PROJECT = new File(RESOURCES_FOLDER + separator + TEST_PROJECT_NAME);
	private static final File TEST_PROJECT_IDEBUG_572 = new File(
			RESOURCES_FOLDER + separator + TEST_PROJECT_NAME_IDEBUG_572);
	private static final File TEST_SRC_FOLDER = new File(TEST_PROJECT, "/src/");
	private static final File TEST_SRC_FOLDER_IDEBUG_572 = new File(TEST_PROJECT_IDEBUG_572, "/src/");
	private static final File TEST_CLASS_FILE = new File(TEST_SRC_FOLDER,
			"/path/to/the/source/" + TEST_CLASS_1 + ".n4js");
	private static final File TEST_CLASS_FILE_IDEBUG_572 = new File(TEST_SRC_FOLDER_IDEBUG_572,
			"/path/to/the/source/" + TEST_CLASS_2 + ".n4js");

	// Test project with mxied N4JS and N4JSX
	private static final String TEST_N4JSX_PROJECT_NAME = "test.discovery.example.project.n4jsx";
	private static final File TEST_N4JSX_PROJECT = new File(RESOURCES_FOLDER + separator + TEST_N4JSX_PROJECT_NAME);

	private static final String TEST_N4JSX_CLASS_3 = "TestClass_3";
	private static final String TEST_N4JSX_CLASS_4 = "TestClass_4";

	/***/
	@WithParentInjector
	public static Injector getParentInjector() {
		return new N4JSXStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Inject
	private TestDiscoveryHelper helper;

	@Inject
	private FileExtensionsRegistry fileExtensionsRegistry;

	@Inject
	private FileBasedWorkspace fbWorkspace;

	/***/
	@Before
	public void prepareIN4JSCore() {
		fbWorkspace.registerProject(URI.createFileURI(TEST_PROJECT.getAbsolutePath()));
		fbWorkspace.registerProject(URI.createFileURI(TEST_PROJECT_IDEBUG_572.getAbsolutePath()));
		fbWorkspace.registerProject(URI.createFileURI(TEST_N4JSX_PROJECT.getAbsolutePath()));
		// Register test file extensions
		fileExtensionsRegistry.register(N4JSGlobals.N4JS_FILE_EXTENSION, FileExtensionType.TESTABLE_FILE_EXTENSION);
		fileExtensionsRegistry.register(N4JSXGlobals.N4JSX_FILE_EXTENSION, FileExtensionType.TESTABLE_FILE_EXTENSION);
		// Register runnable file extensions
		fileExtensionsRegistry.register(N4JSGlobals.N4JS_FILE_EXTENSION, FileExtensionType.RUNNABLE_FILE_EXTENSION);
		fileExtensionsRegistry.register(N4JSGlobals.JS_FILE_EXTENSION, FileExtensionType.RUNNABLE_FILE_EXTENSION);
		fileExtensionsRegistry.register(N4JSXGlobals.N4JSX_FILE_EXTENSION,
				FileExtensionType.RUNNABLE_FILE_EXTENSION);
		fileExtensionsRegistry.register(N4JSXGlobals.JSX_FILE_EXTENSION, FileExtensionType.RUNNABLE_FILE_EXTENSION);
		// Register transpilable file extensions
		fileExtensionsRegistry.register(N4JSGlobals.N4JS_FILE_EXTENSION,
				FileExtensionType.TRANSPILABLE_FILE_EXTENSION);
		fileExtensionsRegistry.register(N4JSXGlobals.N4JSX_FILE_EXTENSION,
				FileExtensionType.TRANSPILABLE_FILE_EXTENSION);
		fileExtensionsRegistry.register(N4JSGlobals.JS_FILE_EXTENSION,
				FileExtensionType.TRANSPILABLE_FILE_EXTENSION);
		fileExtensionsRegistry.register(N4JSXGlobals.JSX_FILE_EXTENSION,
				FileExtensionType.TRANSPILABLE_FILE_EXTENSION);
	}

	/***/
	@Test
	public void testInjection() {
		assertNotNull(helper);
	}

	/***/
	@Test
	public void testDiscoveryExpectNonNullTestTree() {
		assertNotNull(TEST_PROJECT + "", helper.collectTests(toURI(TEST_PROJECT)));
		assertNotNull(TEST_PROJECT_IDEBUG_572 + "", helper.collectTests(toURI(TEST_PROJECT_IDEBUG_572)));
	}

	/***/
	@Test
	public void testDiscoveryForSingleExistingFile() {
		final TestTree actual = helper.collectTests(toURI(TEST_CLASS_FILE));
		assertTestSuiteCount(actual, 3);
		assertTestSuiteNames(actual,
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C");
		assertTestCaseCount(actual, 4);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A", 2);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B", 1);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C", 1);
	}

	/***/
	@Test
	public void testDiscoveryForSingleExistingProject() {
		final TestTree actual = helper.collectTests(toURI(TEST_PROJECT));
		assertTestSuiteCount(actual, 3);
		assertTestSuiteNames(actual,
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C");
		assertTestCaseCount(actual, 4);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A", 2);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B", 1);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C", 1);
	}

	/***/
	@Test
	public void testDiscoveryForSameExistingFile() {
		final TestTree actual = helper.collectTests(toURI(TEST_CLASS_FILE), toURI(TEST_CLASS_FILE));
		assertTestSuiteCount(actual, 3);
		assertTestSuiteNames(actual,
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C");
		assertTestCaseCount(actual, 4);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A", 2);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B", 1);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C", 1);
	}

	/***/
	@Test
	public void testDiscoveryForExistingProjectAndItsContainmentFile() {
		final TestTree actual = helper.collectTests(toURI(TEST_PROJECT), toURI(TEST_CLASS_FILE));
		assertTestSuiteCount(actual, 3);
		assertTestSuiteNames(actual,
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C");
		assertTestCaseCount(actual, 4);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A", 2);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B", 1);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C", 1);
	}

	/***/
	@Test
	public void testDiscoveryForExistingProjectFolderAndFile() {
		final TestTree actual = helper.collectTests(
				toURI(TEST_PROJECT_IDEBUG_572), toURI(TEST_SRC_FOLDER_IDEBUG_572), toURI(TEST_CLASS_FILE_IDEBUG_572));
		assertTestSuiteCount(actual, 2);
		assertTestSuiteNames(actual,
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".C",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".F");
		assertTestCaseCount(actual, 3);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".C", 1);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".F", 2);
	}

	/***/
	@Test
	public void testDiscoveryForSameExistingFile_WithExportFiltering() {
		final TestTree actual = helper.collectTests(toURI(TEST_CLASS_FILE_IDEBUG_572),
				toURI(TEST_CLASS_FILE_IDEBUG_572));
		assertTestSuiteCount(actual, 2);
		assertTestSuiteNames(actual,
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".C",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".F");
		assertTestCaseCount(actual, 3);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".C", 1);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".F", 2);
	}

	/***/
	@Test
	public void testDiscoveryForExistingProjectAndItsContainmentFile_WithExportFiltering() {
		final TestTree actual = helper.collectTests(toURI(TEST_PROJECT_IDEBUG_572), toURI(TEST_CLASS_FILE_IDEBUG_572));
		assertTestSuiteCount(actual, 2);
		assertTestSuiteNames(actual,
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".C",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".F");
		assertTestCaseCount(actual, 3);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".C", 1);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_2 + ".F", 2);
	}

	/***/
	@Test
	public void testDiscoveryForExistingProjectFolderAndFile_WithExportFiltering() {
		final TestTree actual = helper.collectTests(
				toURI(TEST_PROJECT), toURI(TEST_SRC_FOLDER), toURI(TEST_CLASS_FILE));
		assertTestSuiteCount(actual, 3);
		assertTestSuiteNames(actual,
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B",
				TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C");
		assertTestCaseCount(actual, 4);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".A", 2);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".B", 1);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_CLASS_1 + ".C", 1);
	}

	/** N4JSX test discovery tests */
	@Test
	public void testDiscoveryN4JSXExpectNonNullTestTree() {
		assertNotNull(TEST_N4JSX_PROJECT + "", helper.collectTests(toURI(TEST_N4JSX_PROJECT)));
	}

	/***/
	@Test
	public void testDiscoveryN4JSXForSingleExistingProject() {
		final TestTree actual = helper.collectTests(toURI(TEST_N4JSX_PROJECT));
		assertTestSuiteCount(actual, 3);
		assertTestSuiteNames(actual,
				TEST_SRC_STRUCTURE + "." + TEST_N4JSX_CLASS_3 + ".D",
				TEST_SRC_STRUCTURE + "." + TEST_N4JSX_CLASS_3 + ".E",
				TEST_SRC_STRUCTURE + "." + TEST_N4JSX_CLASS_4 + ".F");
		assertTestCaseCount(actual, 7);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_N4JSX_CLASS_3 + ".D", 2);
		assertTestCaseCountForSuite(actual, TEST_SRC_STRUCTURE + "." + TEST_N4JSX_CLASS_3 + ".E", 2);
	}

	private void assertTestSuiteCount(final TestTree actual, final int expected) {
		assertNotNull(actual);
		assertEquals(expected, actual.getSuites().size());
	}

	private void assertTestSuiteNames(final TestTree actual, final String testSuiteName,
			final String... otherTestSuiteNames) {

		final Collection<String> testSuiteNames = newArrayList(asList(testSuiteName, otherTestSuiteNames));
		final Map<String, TestSuite> testSuiteNameMapping = newHashMap(uniqueIndex(actual.getSuites(),
				(Function<TestSuite, String>) suite -> suite.getName()));

		for (final Iterator<String> itr = testSuiteNames.iterator(); itr.hasNext(); /**/) {
			final String name = itr.next();
			if (null != testSuiteNameMapping.remove(name)) {
				itr.remove();
			} else {
				throw new AssertionError("Test suite with name: '" + name + "' does not exist in test tree.\n"
						+ testSuiteNameMapping.keySet());
			}
		}
		assertTrue("There were unexpected test suites:\n" + testSuiteNameMapping.keySet(),
				testSuiteNameMapping.isEmpty());
	}

	private void assertTestCaseCount(final TestTree actual, final int expected) {
		assertNotNull(actual);
		assertEquals(expected, size(actual));
	}

	private void assertTestCaseCountForSuite(final TestTree actual, final String testSuiteName, final int expected) {
		assertNotNull(actual);
		final TestSuite suite = assertHasExactlyOneSuite(actual, testSuiteName);
		assertEquals(expected, suite.getTestCases().size());
	}

	private TestSuite assertHasExactlyOneSuite(final TestTree actual, final String testSuiteName) {
		return getOnlyElement(newArrayList(filter(actual.getSuites(),
				suite -> suite.getName().equals(testSuiteName))));
	}

	private static final URI toURI(File file) {
		return URI.createFileURI(file.getAbsolutePath());
	}
}
