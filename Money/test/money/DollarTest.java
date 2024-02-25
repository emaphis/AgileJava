package money;

import junit.framework.TestCase;

/**
 * Test Dollar class
 * @author emaph
 */
public class DollarTest extends TestCase {

    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    public void testEquality() {
        Dollar five = new Dollar(5);
        Dollar otherFive = new Dollar(5);
        assertTrue(five.equals(otherFive));
        Dollar six = new Dollar(6);
        assertFalse(six.equals(five));
    }

}
