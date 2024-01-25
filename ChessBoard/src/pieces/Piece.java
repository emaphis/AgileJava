package pieces;

/**
 * A class to represent pieces
 * A Piece is a color and a name
 * @author emaph
 */
 public class Piece {
    // Piece colors constants
    public static enum Colors { WHITE, BLACK };

    // Piece names constants
    public static final String PAWN = "pawn";
    public static final String ROOK = "rook";
    public static final String KNIGHT = "knight";
    public static final String BISHOP = "bishop";
    public static final String QUEEN = "queen";
    public static final String KING = "king";

    private static int whiteCount = 0;
    private static int blackCount = 0;

    private final Colors color;
    private final String name;

    /**
     * Static Piece factory
     * @param color
     * @param name
     * @return new Piece
     */
    public static Piece createWhite(String name) {
        whiteCount++;
        return new Piece(Colors.WHITE, name);
    }


    /**
     * Static Piece factory
     * @param color
     * @param name
     * @return new Piece
     */
    public static Piece createBlack(String name) {
        blackCount++;
        return new Piece(Colors.BLACK, name);
    }

    /**
     * Get White Piece count
     * @return white piece count
     */
    public static int getWhiteCount() {
        return whiteCount;
    }

    /**
     * Get Black Piece count
     * @return black piece count
     */
    public static int getBlackCount() {
        return blackCount;
    }
    /**
     * Create Pawn of a given color and printable representation
     * @param cdolor
     */
    private Piece(Colors color, String name) {
        this.color = color;
        this.name = name;
    }

    /**
     * Return Pawns color
     * @return color4
     */
    public Colors getColor() {
        return color;
    }

    /**
     * @return printable representation based on Piece.color
     */
    public char getRepresentation() {
        char representation;

        if (name.equals(Piece.PAWN))
            representation = 'p';
        else if (name.equals(Piece.ROOK))
            representation = 'r';
        else if (name.equals(Piece.KNIGHT))
            representation = 'n';
        else if (name.equals(Piece.BISHOP))
            representation = 'b';
        else if (name.equals(Piece.QUEEN))
            representation = 'q';
        else if (name.equals(Piece.KING))
            representation = 'k';
        else
            return '.';

        if (color == Colors.BLACK)
            representation = Character.toUpperCase(representation);

        return representation;
    }

    public boolean isWhite() {
        return color == Colors.WHITE;
    }

    public boolean isBlack() {
        return !isWhite();
    }
}
