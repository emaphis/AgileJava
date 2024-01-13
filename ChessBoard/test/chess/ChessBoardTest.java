
package chess;

import pieces.Pawn;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class ChessBoardTest extends TestCase {

    public void testCreate() {
        ChessBoard board = new ChessBoard();
        assertEquals(0, board.getNumberPieces());
    }

    public void testAddPieces() {
        ChessBoard board = new ChessBoard();
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
