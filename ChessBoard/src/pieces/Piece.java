package pieces;

/**
 * A class to represent pieces
 * A Piece is a color and a name
 * @author emaph
 */
 public class Piece {
    // Piece colors constants
    private static enum Colors { WHITE, BLACK, BLNK };

    // Piece names constants
    public static enum Type { PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING, NO_PIECE };

    // Piece reresentation constats (eventuall fold into Type enum)
    public static char PAWN_REPRESENTATION = 'p';
    public static char ROOK_REPRESENTATION = 'r';
    public static char KNIGHT_REPRESENTATION = 'n';
    public static char BISHOP_REPRESENTATION = 'b';
    public static char QUEEN_REPRESENTATION = 'q';
    public static char KING_REPRESENTATION = 'k';
    public static char BLANK_REPRESENTATION = '.';


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

    public static Piece noPiece() {
        return new Piece(Colors.WHITE, Type.NO_PIECE);
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
            representation = PAWN_REPRESENTATION;
        else if (type == Type.ROOK)
            representation = ROOK_REPRESENTATION;
        else if (type == Type.KNIGHT)
            representation = KNIGHT_REPRESENTATION;
        else if (type == Type.BISHOP)
            representation = BISHOP_REPRESENTATION;
        else if (type == Type.QUEEN)
            representation = QUEEN_REPRESENTATION;
        else if (type == Type.KING)
            representation = KING_REPRESENTATION;
        else if (type == Type.NO_PIECE)
            representation = BLANK_REPRESENTATION;
        else
            representation = '*';   // for error reprsentation

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

    public boolean isBlank() {
        return color == Colors.BLNK;
    }
}
