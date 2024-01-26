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
    public static enum Type { PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING };

    private static int whiteCount = 0;
    private static int blackCount = 0;

    private final Colors color;
    private final Type type;

    public static Piece createWhitePawn() {
        whiteCount++;
        return new Piece(Colors.WHITE, Type.PAWN);
    }

    public static Piece createWhiteRook() {
        whiteCount++;
        return new Piece(Colors.WHITE, Type.ROOK);
    }

    public static Piece createWhiteKnight() {
        whiteCount++;
        return new Piece(Colors.WHITE, Type.KNIGHT);
    }
    public static Piece createWhiteBishop() {
        whiteCount++;
        return new Piece(Colors.WHITE, Type.BISHOP);
    }

    public static Piece createWhiteQueen() {
        whiteCount++;
        return new Piece(Colors.WHITE, Type.QUEEN);
    }
    public static Piece createWhiteKing() {
        whiteCount++;
        return new Piece(Colors.WHITE, Type.KING);
    }

    public static Piece createBlackPawn() {
        blackCount++;
        return new Piece(Colors.BLACK, Type.PAWN);
    }

    public static Piece createBlackRook() {
        blackCount++;
        return new Piece(Colors.BLACK, Type.ROOK);
    }

    public static Piece createBlackKnight() {
        blackCount++;
        return new Piece(Colors.BLACK, Type.KNIGHT);
    }

    public static Piece createBlackBishop() {
        blackCount++;
        return new Piece(Colors.BLACK, Type.BISHOP);
    }

    public static Piece createBlackQueen() {
        blackCount++;
        return new Piece(Colors.BLACK, Type.QUEEN);
    }

    public static Piece createBlackKing() {
        blackCount++;
        return new Piece(Colors.BLACK, Type.KING);
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
    private Piece(Colors color, Type type) {
        this.color = color;
        this.type = type;
    }


    /**
     * @return printable representation based on Piece.color
     */
    public char getRepresentation() {
        char representation;

        if (type == Type.PAWN)
            representation = 'p';
        else if (type == Type.ROOK)
            representation = 'r';
        else if (type == Type.KNIGHT)
            representation = 'n';
        else if (type == Type.BISHOP)
            representation = 'b';
        else if (type == Type.QUEEN)
            representation = 'q';
        else if (type == Type.KING)
            representation = 'k';
        else
            return '.';

        if (color == Colors.BLACK)
            representation = Character.toUpperCase(representation);

        return representation;
    }

    public Piece.Type getType() {
        return type;
    }

    public boolean isWhite() {
        return color == Colors.WHITE;
    }

    public boolean isBlack() {
        return !isWhite();
    }
}
