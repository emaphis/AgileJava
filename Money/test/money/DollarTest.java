package money;

import junit.framework.TestCase;

/**
 * Test Dollar class
 * @author emaph
 */
public class DollarTest extends TestCase {

    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    public void testEquality() {
        Dollar five = new Dollar(5);
        assertTrue(five.equals(new Dollar(5)));
        Dollar six = new Dollar(6);
        assertFalse(six.equals(five));
    }

}
