package pieces;

/**
 * A class to represent pieces A Piece is a color and a name
 *
 * @author emaph
 */
public class Piece {

    // Piece colors constants
    public static enum Colors {
        WHITE, BLACK, BLNK
    };

    // Piece names constants
    public static enum Type {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING, NO_PIECE
    };

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

    private static Piece createPiece(Colors color, Type type) {
        if (color == Colors.WHITE)
            whiteCount++;
        else if (color == Colors.BLACK)
            blackCount++;
        return new Piece(color, type);
    }

    public static Piece createWhitePawn() {
        return createPiece(Colors.WHITE, Type.PAWN);
    }

    public static Piece createWhiteRook() {
        return createPiece(Colors.WHITE, Type.ROOK);
    }

    public static Piece createWhiteKnight() {
        return createPiece(Colors.WHITE, Type.KNIGHT);
    }

    public static Piece createWhiteBishop() {
        return createPiece(Colors.WHITE, Type.BISHOP);
    }

    public static Piece createWhiteQueen() {
        return createPiece(Colors.WHITE, Type.QUEEN);
    }

    public static Piece createWhiteKing() {
        return createPiece(Colors.WHITE, Type.KING);
    }

    public static Piece createBlackPawn() {
        return createPiece(Colors.BLACK, Type.PAWN);
    }

    public static Piece createBlackRook() {
        return createPiece(Colors.BLACK, Type.ROOK);
    }

    public static Piece createBlackKnight() {
        return createPiece(Colors.BLACK, Type.KNIGHT);
    }

    public static Piece createBlackBishop() {
        return createPiece(Colors.BLACK, Type.BISHOP);
    }

    public static Piece createBlackQueen() {
        return createPiece(Colors.BLACK, Type.QUEEN);
    }

    public static Piece createBlackKing() {
        return createPiece(Colors.BLACK, Type.KING);
    }

    public static Piece noPiece() {
        return createPiece(Colors.BLNK, Type.NO_PIECE);
    }

    public static void resetPieceCounts() {
        Piece.whiteCount = 0;
        Piece.blackCount = 0;
    }

    /**
     * Get White Piece count
     *
     * @return white piece count
     */
    public static int getWhiteCount() {
        return whiteCount;
    }

    /**
     * Get Black Piece count
     *
     * @return black piece count
     */
    public static int getBlackCount() {
        return blackCount;
    }

    /**
     * Create Pawn of a given color and printable representation
     *
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

        if (type == Type.PAWN) {
            representation = PAWN_REPRESENTATION;
        } else if (type == Type.ROOK) {
            representation = ROOK_REPRESENTATION;
        } else if (type == Type.KNIGHT) {
            representation = KNIGHT_REPRESENTATION;
        } else if (type == Type.BISHOP) {
            representation = BISHOP_REPRESENTATION;
        } else if (type == Type.QUEEN) {
            representation = QUEEN_REPRESENTATION;
        } else if (type == Type.KING) {
            representation = KING_REPRESENTATION;
        } else if (type == Type.NO_PIECE) {
            representation = BLANK_REPRESENTATION;
        } else {
            representation = '*';   // for error reprsentation
        }
        if (color == Colors.BLACK) {
            representation = Character.toUpperCase(representation);
        }

        return representation;
    }

    public Piece.Type getType() {
        return type;
    }

    public Piece.Colors getColor() {
        return color;
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
