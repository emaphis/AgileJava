import java.util.Date;
import junit.framework.TestCase;

/**
 * Test Comparable interface.
 * @author emaph
 */
public class ComparibleTest extends TestCase {

    public void testStringCompareTo() {
        assertTrue("A".compareTo("B") < 0);
        assertEquals(0, "A".compareTo("A"));
        assertTrue("B".compareTo("A") > 0);
    }

}
