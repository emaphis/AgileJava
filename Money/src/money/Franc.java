package money;

/**
 *
 * @author emaph
 */
class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    String currency() {
        return "CHF";
    }

}
