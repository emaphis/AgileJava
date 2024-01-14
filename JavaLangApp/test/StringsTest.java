
import junit.framework.TestCase;

/**
 * Test the properties of Strings
 * @author emaph
 */
public class StringsTest extends TestCase {

    public void testStrings() {
        String a = "abc";
        //String b = new String("abc");

        assertEquals(3, a.length());

        assertEquals("abcdef", "abc" + "def");
        assertEquals("123456", "12" + "3" + "456");
    }

}
