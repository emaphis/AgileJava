package pieces;

/**
 * A class to represent pawns
 * @author emaph
 */
 public class Pawn {
    public static final String WHITE = "white";
    public static final String BLACK = "black";

    private final String color;
    private final char representation;

    /**
     * Create a Pawn of default color and printable representation (white/'p')
     */
    public Pawn() {
        this.color = Pawn.WHITE;
        this.representation = 'p';
    }

    /**
     * Create Pawn of a given color and printable representation
     * @param color
     */
    public Pawn(String color, char representation) {
        this.color = color;
        this.representation = representation;
    }

    /**
     * Return Pawns color
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return printable representation
     */
    public char getRepresentation() {
        return representation;
    }
}
