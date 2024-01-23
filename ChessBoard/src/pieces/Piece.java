package pieces;

/**
 * A class to represent pieces
 * A Piece is a color and a name
 * @author emaph
 */
 public class Piece {
    public static final String WHITE = "white";
    public static final String BLACK = "black";

    private final String color;
    private final String name;

    /**
     * Create Pawn of a given color and printable representation
     * @param color
     */
    public Piece(String color, String name) {
        this.color = color;
        this.name = "name";

    }

    /**
     * Return Pawns color
     * @return color4
     */
    public String getColor() {
        return color;
    }

    /**
     * @return printable representation based on Piece.color
     */
    public char getRepresentation() {
        char representation;

        if (color.equals(WHITE))
            representation = 'p';
        else
            representation = 'P';

        return representation;
    }
}
