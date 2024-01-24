package sis.report;

import junit.framework.TestSuite;

/**
 * Run all tests in sis.report package
 * @author emaph
 */
public class AllTests {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(RosterReportTest.class);
        suite.addTestSuite(CourseReportTest.class);
        return suite;
    }
}
