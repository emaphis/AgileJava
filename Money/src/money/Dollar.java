package money;

/**
 *
 * @author emaph
 */
class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Dollar other = (Dollar)obj;
        return this.amount == other.amount;
    }
}
