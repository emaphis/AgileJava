package money;

/**
 *
 * @author emaph
 */
class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
