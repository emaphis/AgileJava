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
    private final char representation;

    /**
     * Create a Pawn of default color and printable representation (white/'p')
     */
    public Piece() {
        this.color = Piece.WHITE;
        this.name = "pawn";
        this.representation = 'p';
    }

    /**
     * Create Pawn of a given color and printable representation
     * @param color
     */
    public Piece(String color, String name) {
        this.color = color;
        this.name = "name";
        if (color.equals(WHITE))
            this.representation = 'p';
        else
            this.representation = 'P';
    }

    /**
     * Return Pawns color
     * @return color4
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
