
package chess;

import junit.framework.TestCase;
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
    }

    public void testCreate() {
        assertEquals(16, board.getNumberPieces());
        assertEquals("pppppppp", board.printRank2());
        assertEquals("PPPPPPPP", board.printRank7());
    }

    public void testBoardRepresentation() {
        String boardRep =
                addNewLine("........") +
                addNewLine("PPPPPPPP") +
                addNewLine("........") +
                addNewLine("........") +
                addNewLine("........") +
                addNewLine("........") +
                addNewLine("pppppppp") +
                addNewLine("........");

        System.out.println(board.printBoard());
        assertEquals(boardRep, board.printBoard());
    }

}
