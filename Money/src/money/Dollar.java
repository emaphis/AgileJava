package money;

/**
 *
 * @author emaph
 */
class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return "USD";
    }

}
