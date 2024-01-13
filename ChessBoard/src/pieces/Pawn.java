package pieces;

/**
 * A class to represent pawns
 * @author emaph
 */
 public class Pawn {
    public static final String WHITE = "white";
    public static final String BLACK = "black";

    private String color;

    /**
     * Create a Pawn of default color (white)
     */
    public Pawn() {
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
