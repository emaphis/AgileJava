
package money;

/**
 * Common base class for money classes
 * @author emaph
 */
public abstract class Money {
    protected int amount;

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        Money other = (Money)obj;
        return this.amount == other.amount
                && getClass().equals(other.getClass());
    }

    abstract String currency();

}
