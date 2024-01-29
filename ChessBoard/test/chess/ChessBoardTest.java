
package chess;

import junit.framework.TestCase;
import pieces.Piece;
import static util.StringUtil.addNewLine;

/**
 *
 * @author emaph
 */
public class ChessBoardTest extends TestCase {
    private ChessBoard board;

    @Override
    protected void setUp() throws Exception {
        board = new ChessBoard();
        board.initalize();
    }

    public void testCreate() {
        assertEquals(32, board.getNumberPieces());
        assertEquals(16, board.getNumberWhitePieces());
        assertEquals(16, board.getNumberBlackPieces());

        assertEquals("........", board.printRank(board.rank3));
        assertEquals("pppppppp", board.printRank(board.rank2));
        assertEquals("PPPPPPPP", board.printRank(board.rank7));
        assertEquals("rnbqkbnr", board.printRank(board.rank1));
        assertEquals("RNBQKBNR", board.printRank(board.rank8));
    }

    public void testNewBoardShouldHaveNoPiecesBeforeIntialization() {
        ChessBoard newBoard = new ChessBoard(); // don't call initialize
        assertEquals(0, newBoard.getNumberPieces());
       // assertEquals(0, newBoard.getNumberWhitePieces());
      //  assertEquals(0, newBoard.getNumberBlackPieces());
    }


    public void testBoardRepresentation() {
        String blankRank = addNewLine("........");
        String boardRep =
                addNewLine("RNBQKBNR") +
                addNewLine("PPPPPPPP") +
                blankRank + blankRank +
                blankRank + blankRank +
                addNewLine("pppppppp") +
                addNewLine("rnbqkbnr");

        System.out.println(board.print());
        assertEquals(boardRep, board.print());
    }

    public void testGetNumberOfPieces() {
        assertEquals(8, board.getNumberPieces(Piece.Colors.WHITE, Piece.PAWN_REPRESENTATION));
        assertEquals(2, board.getNumberPieces(Piece.Colors.WHITE, Piece.ROOK_REPRESENTATION));
        assertEquals(1, board.getNumberPieces(Piece.Colors.WHITE, Piece.QUEEN_REPRESENTATION));
        assertEquals(1, board.getNumberPieces(Piece.Colors.BLACK, Piece.QUEEN_REPRESENTATION));
        assertEquals(8, board.getNumberPieces(Piece.Colors.BLACK, Piece.PAWN_REPRESENTATION));
    }

    /**
     *   R N B Q K B N R  8 (rank 8)
     *   P P P P P P P P  7
     *   . . . . . . . .  6
     *   . . . . . . . .  5
     *   . . . . . . . .  4
     *   . . . . . . . .  3
     *   p p p p p p p p  2
     *   r n b q k b n r  1 (rank 1)
     *
     *   a b c d e f g h
     *
     */
    public void testgetWhitePiece() {
        Piece piece1 = board.getPieceWhite("a1");
        assertNotNull(piece1);
        assertEquals(piece1.getColor(), Piece.Colors.WHITE);
        assertEquals(piece1.getType(), Piece.Type.ROOK);

        Piece piece2 = board.getPieceWhite("a2");
        assertNotNull(piece2);
        assertEquals(piece2.getColor(), Piece.Colors.WHITE);
        assertEquals(piece2.getType(), Piece.Type.PAWN);

        Piece piece3 = board.getPieceWhite("h5");
        assertNotNull(piece3);
        assertEquals(piece3.getColor(), Piece.Colors.BLNK);
        assertEquals(piece3.getType(), Piece.Type.NO_PIECE);

        Piece piece4 = board.getPieceWhite("h7");
        assertNotNull(piece4);
        assertEquals(piece4.getColor(), Piece.Colors.BLACK);
        assertEquals(piece4.getType(), Piece.Type.PAWN);

        Piece piece5 = board.getPieceWhite("g8");
        assertNotNull(piece5);
        assertEquals(piece5.getColor(), Piece.Colors.BLACK);
        assertEquals(piece5.getType(), Piece.Type.KNIGHT);

        Piece piece6 = board.getPieceWhite("a1");
        assertNotNull(piece6);
        assertEquals(piece6.getColor(), Piece.Colors.WHITE);
        assertEquals(piece6.getType(), Piece.Type.ROOK);
    }

}
