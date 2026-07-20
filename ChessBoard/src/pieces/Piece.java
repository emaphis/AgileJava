package pieces;

/**
 * A class to represent pieces A Piece is a color and a name
 *
 * @author emaph
 */
public class Piece {

    // Piece color constants
    public static enum Color {
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

    private final Color color;
    private final Type type;

    /**
     * Piece constructor, creates a Piece of a given color and  apiece type
     *
     * @param color
     * @param type
     * @return a Piece
     */
    private Piece(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    private static Piece createPiece(Color color, Type type) {
        pieceCount(color);
        return new Piece(color, type);
    }


    public static Piece createPawn(Color color) {
        return createPiece(color, Type.PAWN);
    }

    public static Piece createRook(Color color) {
        return createPiece(color, Type.ROOK);
    }

    public static Piece createKnight(Color color) {
        return createPiece(color, Type.KNIGHT);
    }

    public static Piece createBishop(Color color) {
        return createPiece(color, Type.BISHOP);
    }

    public static Piece createQueen(Color color) {
        return createPiece(color, Type.QUEEN);
    }

    public static Piece createKing(Color color) {
        return createPiece(color, Type.KING);
    }

    public static Piece noPiece() {
        return createPiece(Color.BLNK, Type.NO_PIECE);
    }

    /**
     * Blech !
     */
    public static void resetPieceCounts() {
        Piece.whiteCount = 0;
        Piece.blackCount = 0;
    }

    /**
     * Counts the pieces created by cikir,
     * @param color
     */
    private static void pieceCount(Color color) {
        if (color == Color.WHITE)
            whiteCount++;
        else if (color == Color.BLACK)
            blackCount++;
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

        if (color == Color.BLACK) {
            representation = Character.toUpperCase(representation);
        }

        return representation;
    }

    public Piece.Type getType() {
        return type;
    }

    public Piece.Color getColor() {
        return color;
    }

    public boolean isWhite() {
        return color == Color.WHITE;
    }

    public boolean isBlack() {
        return color == Color.BLACK;
    }

    public boolean isBlank() {
        return color == Color.BLNK;
    }
}
