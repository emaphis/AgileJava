
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
        assertEquals(0, board.getNumberPieces());
    }

    public void testAddPieces() {
        assertEquals(0, board.getNumberPieces());

        Pawn pawn1 = new Pawn();
        board.addPiece(pawn1);
        assertEquals(1, board.getNumberPieces());
        assertEquals(pawn1, board.getPiece(0));

        Pawn pawn2 = new Pawn();
        board.addPiece(pawn2);
        assertEquals(2, board.getNumberPieces());
        assertEquals(pawn2, board.getPiece(1));

        // board.addPiece(new Integer(5)); // Compiler error
    }
}
