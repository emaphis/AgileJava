package pieces;

/**
 * A class to represent pieces
 * A Piece is a color and a name
 * @author emaph
 */
 public class Piece {
    // Piece colors constants
    private static enum Colors { WHITE, BLACK };

    // Piece names constants
    public static enum Pieces { PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING };

    private static int whiteCount = 0;
    private static int blackCount = 0;

    private final Colors color;
    private final Pieces type;

    public static Piece createWhitePawn() {
        whiteCount++;
        return new Piece(Colors.WHITE, Pieces.PAWN);
    }

    public static Piece createWhiteRook() {
        whiteCount++;
        return new Piece(Colors.WHITE, Pieces.ROOK);
    }

    public static Piece createWhiteKnight() {
        whiteCount++;
        return new Piece(Colors.WHITE, Pieces.KNIGHT);
    }
    public static Piece createWhiteBishop() {
        whiteCount++;
        return new Piece(Colors.WHITE, Pieces.BISHOP);
    }

    public static Piece createWhiteQueen() {
        whiteCount++;
        return new Piece(Colors.WHITE, Pieces.QUEEN);
    }
    public static Piece createWhiteKing() {
        whiteCount++;
        return new Piece(Colors.WHITE, Pieces.KING);
    }

    public static Piece createBlackPawn() {
        blackCount++;
        return new Piece(Colors.BLACK, Pieces.PAWN);
    }

    public static Piece createBlackRook() {
        blackCount++;
        return new Piece(Colors.BLACK, Pieces.ROOK);
    }

    public static Piece createBlackKnight() {
        blackCount++;
        return new Piece(Colors.BLACK, Pieces.KNIGHT);
    }

    public static Piece createBlackBishop() {
        blackCount++;
        return new Piece(Colors.BLACK, Pieces.BISHOP);
    }

    public static Piece createBlackQueen() {
        blackCount++;
        return new Piece(Colors.BLACK, Pieces.QUEEN);
    }

    public static Piece createBlackKing() {
        blackCount++;
        return new Piece(Colors.BLACK, Pieces.KING);
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
    private Piece(Colors color, Pieces type) {
        this.color = color;
        this.type = type;
    }


    /**
     * @return printable representation based on Piece.color
     */
    public char getRepresentation() {
        char representation;

        if (type == Pieces.PAWN)
            representation = 'p';
        else if (type == Pieces.ROOK)
            representation = 'r';
        else if (type == Pieces.KNIGHT)
            representation = 'n';
        else if (type == Pieces.BISHOP)
            representation = 'b';
        else if (type == Pieces.QUEEN)
            representation = 'q';
        else if (type == Pieces.KING)
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
