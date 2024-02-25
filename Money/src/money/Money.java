
package money;

/**
 * Common base class for money classes
 * @author emaph
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money other = (Money)obj;
        return this.amount == other.amount;
    }

}
