package money;

import junit.framework.TestCase;

/**
 * Test Dollar class
 * @author emaph
 */
public class DollarTest extends TestCase {

    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
        five.times(3);
        assertEquals(30, five.amount);
    }

}
