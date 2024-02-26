package money;

/**
 *
 * @author emaph
 */
class Dollar extends Money {

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }


}
