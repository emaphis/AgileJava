
import junit.framework.TestCase;

/**
 * Test character (char) properties.
 * @author emaph
 */
public class CharsTest extends TestCase {

    public void testChars() {
        char captialA = 'A';
        assertEquals(65, captialA);
        assertEquals('\u0041', captialA);  // 4-digit hex
        assertEquals('\101', captialA);  // octal
    }

    public void testWhiteSpace() {
        assertTrue(Character.isWhitespace(' '));
        assertTrue(Character.isWhitespace('\n'));
        assertTrue(Character.isWhitespace('\t'));
        assertTrue(Character.isWhitespace('\r'));

        // not
        assertFalse(Character.isWhitespace('\b'));
        assertFalse(Character.isWhitespace('A'));
        assertFalse(Character.isWhitespace('5'));
        assertFalse(Character.isWhitespace('.'));
        assertFalse(Character.isWhitespace('-'));
    }
}
