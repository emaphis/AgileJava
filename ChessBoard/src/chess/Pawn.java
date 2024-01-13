package chess;

/**
 * A class to represent pawns
 * @author emaph
 */
class Pawn {
    static final String WHITE = "white";
    static final String BLACK = "black";

    private String color;

    /**
     * Create a Pawn of default color (white)
     */
    Pawn() {
        this.color = this.WHITE;
    }

    /**
     * Create Pawn of a given color
     * @param color
     */
    public Pawn(String color) {
        this.color = color;
    }

    /**
     * Return Pawns color
     * @return color
     */
    public String getColor() {
        return color;
    }
}
