package util;

import junit.framework.TestCase;

/**
 * Test the util.StringUtil utilities.
 * @author emaph
 */
public class StringUtilTest extends TestCase {
    private StringBuilder builder;

    @Override
    protected void setUp() throws Exception {
        this.builder = new StringBuilder();
    }

    public void testAddNewLine() {
        assertEquals("" + StringUtil.NEWLINE, StringUtil.addNewLine(""));
        assertEquals("hello" + StringUtil.NEWLINE, StringUtil.addNewLine("hello"));
    }
}
