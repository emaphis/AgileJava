
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


    public void testNewBoardShouldHaveNoPiecesBeforeIntialization() {
        ChessBoard newBoard = new ChessBoard(); // don't call initialize
        assertEquals(0, newBoard.getNumberPieces());
        assertEquals(0, newBoard.getNumberWhitePieces());
        assertEquals(0, newBoard.getNumberBlackPieces());
    }

     public void testNewBoardShouldPiecesBeforeAfterIntialization() {
        ChessBoard newBoard = new ChessBoard();
        newBoard.initalize();
        assertEquals(32, newBoard.getNumberPieces());
        assertEquals(16, newBoard.getNumberWhitePieces());
        assertEquals(16, newBoard.getNumberBlackPieces());
    }

    public void testPrintRank() {
        assertEquals("........", board.printRank(board.rank3));
        assertEquals("PPPPPPPP", board.printRank(board.rank7));
        assertEquals("pppppppp", board.printRank(board.rank2));
        assertEquals("RNBQKBNR", board.printRank(board.rank8));
        assertEquals("rnbqkbnr", board.printRank(board.rank1));
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

    public void testCountPieces() {
        assertEquals(8, board.countPieces("white", Piece.PAWN_REPRESENTATION));
        assertEquals(2, board.countPieces("white", Piece.ROOK_REPRESENTATION));
        assertEquals(1, board.countPieces("white", Piece.QUEEN_REPRESENTATION));
        assertEquals(1, board.countPieces("black", Piece.QUEEN_REPRESENTATION));
//        assertEquals(8, board.countPieces("black", Piece.PAWN_REPRESENTATION));
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
    public void testGetPiece() {
        Piece piece1 = board.getPiece("a1");
        assertNotNull(piece1);
        assertEquals("white", piece1.getColor());
        assertEquals(piece1.getType(), Piece.Type.ROOK);

        Piece piece2 = board.getPiece("a2");
        assertNotNull(piece2);
        assertEquals("white", piece2.getColor());
        assertEquals(piece2.getType(), Piece.Type.PAWN);

        Piece piece3 = board.getPiece("h5");
        assertNotNull(piece3);
        assertEquals("blank", piece3.getColor());
        assertEquals(piece3.getType(), Piece.Type.NO_PIECE);

        Piece piece4 = board.getPiece("h7");
        assertNotNull(piece4);
        assertEquals("black", piece4.getColor());
        assertEquals(piece4.getType(), Piece.Type.PAWN);

        Piece piece5 = board.getPiece("g8");
        assertNotNull(piece5);
        assertEquals("black", piece5.getColor());
        assertEquals(piece5.getType(), Piece.Type.KNIGHT);

        Piece piece6 = board.getPiece("a1");
        assertNotNull(piece6);
        assertEquals("white", piece6.getColor());
        assertEquals(piece6.getType(), Piece.Type.ROOK);
    }

}
