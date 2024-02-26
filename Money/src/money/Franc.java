package money;

/**
 *
 * @author emaph
 */
class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }


}
