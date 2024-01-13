
package chess;

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

}
