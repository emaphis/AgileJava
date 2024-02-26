
package money;

import java.util.Objects;

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

    @Override
    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    @Override
    public boolean equals(Object obj) {
        Money other = (Money)obj;
        return this.amount == other.amount
                && currency().equals(other.currency());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.amount;
        hash = 23 * hash + Objects.hashCode(this.currency);
        return hash;
    }

    String currency() {
        return currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

}
