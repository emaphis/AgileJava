
package money;

/**
 * Common base class for money classes
 * @author emaph
 */
public class Money implements Expression {
    protected int amount;
    protected String currency;

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(String to) {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        Money other = (Money)obj;
        return this.amount == other.amount
                && currency().equals(other.currency());
    }

    String currency() {
        return currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

}
