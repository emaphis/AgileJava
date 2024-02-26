package money;

import junit.framework.TestCase;

/**
 * Test Money class
 * @author emaph
 */
public class MoneyTest extends TestCase {

    public void testMultiplication() {
        Money fiveD = Money.dollar(5);
        assertEquals(Money.dollar(10), fiveD.times(2));
        assertEquals(Money.dollar(15), fiveD.times(3));
        Money fiveF = Money.franc(5);
        assertEquals(Money.franc(10), fiveF.times(2));
    }

    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Money sum = five.plus(five);
        assertEquals(Money.dollar(10), sum);

        Money six = Money.dollar(6);
        Money sum2 = five.plus(six);
        assertEquals(Money.dollar(11), sum2);
    }

    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

}
