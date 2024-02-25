package money;

/**
 *
 * @author emaph
 */
class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    @Override
    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }


}
