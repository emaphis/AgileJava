
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
    }

    /**
     * Test pieces are already added to new board
     */
    public void testzNewBoard() {
        assertEquals(16, board.getNumberPieces());
        assertEquals(Pawn.WHITE, board.getPiece(0).getColor());
        assertEquals('p', board.getPiece(0).getRepresentation());
        assertEquals(Pawn.WHITE, board.getPiece(2).getColor());
        assertEquals('p', board.getPiece(2).getRepresentation());
        assertEquals(Pawn.WHITE, board.getPiece(8).getColor());
        assertEquals('p', board.getPiece(8).getRepresentation());
        assertEquals(Pawn.WHITE, board.getPiece(15).getColor());
        assertEquals('p', board.getPiece(15).getRepresentation());
    }

}
