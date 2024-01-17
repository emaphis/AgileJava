
package chess;

import pieces.Pawn;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class ChessBoardTest extends TestCase {
    private ChessBoard board;

    @Override
    protected void setUp() throws Exception {
        board = new ChessBoard();
    }

    public void testCreate() {
        assertEquals(16, board.getNumberPieces());
        assertEquals("pppppppp", board.printRank(board.rank2));
        assertEquals("PPPPPPPP", board.printRank(board.rank7));
    }

    /**
     * Test pieces are already added to new board
     */
    public void testNewBoard() {
        assertEquals(16, board.getNumberPieces());

        assertEquals(Pawn.WHITE, board.getPiece(board.rank2, 0).getColor());
        assertEquals('p', board.getPiece(board.rank2, 0).getRepresentation());
        assertEquals(Pawn.WHITE, board.getPiece(board.rank2, 3).getColor());
        assertEquals('p', board.getPiece(board.rank2, 3).getRepresentation());
        assertEquals(Pawn.WHITE, board.getPiece(board.rank2, 7).getColor());
        assertEquals('p', board.getPiece(board.rank2, 7).getRepresentation());

        assertEquals(Pawn.BLACK, board.getPiece(board.rank7, 0).getColor());
        assertEquals('P', board.getPiece(board.rank7, 0).getRepresentation());
        assertEquals(Pawn.BLACK, board.getPiece(board.rank7, 3).getColor());
        assertEquals('P', board.getPiece(board.rank7, 3).getRepresentation());
        assertEquals(Pawn.BLACK, board.getPiece(board.rank7, 7).getColor());
        assertEquals('P', board.getPiece(board.rank7, 7).getRepresentation());
    }

}
