package money;

/**
 *
 * @author emaph
 */
class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc other = (Franc)obj;
        return this.amount == other.amount;
    }
}
