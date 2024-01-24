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
     * Static Piece factory
     * @param color
     * @param name
     * @return new Piece
     */
    public static Piece create(String color, String name) {
        return new Piece(color, name);
    }

    /**
     * Create Pawn of a given color and printable representation
     * @param color
     */
    private Piece(String color, String name) {
        this.color = color;
        this.name = name;
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

        if (name.equals("pawn"))
            representation = 'p';
        else if (name.equals("rook"))
            representation = 'r';
        else if (name.equals("knight"))
            representation = 'n';
        else if (name.equals("bishop"))
            representation = 'b';
        else if (name.equals("queen"))
            representation = 'q';
        else if (name.equals("king"))
            representation = 'k';
        else
            return '.';

        if (color.equals(BLACK))
            representation = Character.toUpperCase(representation);

        return representation;
    }
}