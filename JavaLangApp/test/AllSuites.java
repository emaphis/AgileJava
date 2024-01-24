

import junit.framework.TestSuite;

/**
 * Run all tests in sis.report package
 * @author emaph
 */
public class AllSuites {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(CharsTest.class);
        suite.addTestSuite(StringsTest.class);
        suite.addTestSuite(ListSortTest.class);
        return suite;
    }
}
