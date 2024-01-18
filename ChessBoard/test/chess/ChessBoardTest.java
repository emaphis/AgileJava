
package chess;

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
        assertEquals("pppppppp", board.printRank2());
        assertEquals("PPPPPPPP", board.printRank7());
    }

    public void testBoardRepresentation() {
        String boardRep =
                "........" + ChessBoard.NEWLINE +
                "PPPPPPPP" + ChessBoard.NEWLINE +
                "........" + ChessBoard.NEWLINE +
                "........" + ChessBoard.NEWLINE +
                "........" + ChessBoard.NEWLINE +
                "........" + ChessBoard.NEWLINE +
                "pppppppp" + ChessBoard.NEWLINE +
                "........" + ChessBoard.NEWLINE;
        assertEquals(boardRep, board.printBoard());

        System.out.println(board.printBoard());
    }

}
