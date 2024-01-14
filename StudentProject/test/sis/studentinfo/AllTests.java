package sis.studentinfo;

import sis.report.RosterReportTest;
import junit.framework.TestSuite;


/**
 * Students project test suite
 * @author emaph
 */
public class AllTests {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(RosterReportTest.class);
        suite.addTestSuite(DateUntilTest.class);
        return suite;
    }
}
