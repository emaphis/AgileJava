package money;

/**
 *
 * @author emaph
 */
class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    @Override
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }


}
