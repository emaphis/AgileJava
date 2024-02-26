
package money;

/**
 * Common base class for money classes
 * @author emaph
 */
public abstract class Money {
    protected int amount;
    protected String currency;

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        Money other = (Money)obj;
        return this.amount == other.amount
                && getClass().equals(other.getClass());
    }

    String currency() {
        return currency;
    }

}
