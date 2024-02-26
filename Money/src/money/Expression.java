package money;

/**
 *
 * @author emaph
 */
public interface Expression {
    public Money reduce(Bank bank, String to);
}
