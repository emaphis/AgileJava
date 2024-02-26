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
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);

        Money six = Money.dollar(6);
        Expression sum2 = five.plus(six);
        reduced = bank.reduce(sum2, "USD");
        assertEquals(Money.dollar(11), reduced);
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
