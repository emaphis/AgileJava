package chess;

import junit.framework.TestSuite;
import pieces.PawnTest;
import util.StringUtilTest;

/**
 * Test Suite to run all project tests
 * @author emaph
 */
public class AllTests {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(ChessBoardTest.class);
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(StringUtilTest.class);
        return suite;
    }

}
