
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

}
