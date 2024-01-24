
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
        board.initalize();
        assertEquals(16, board.getNumberPieces());
        assertEquals("pppppppp", board.printRank(board.rank2));
        assertEquals("PPPPPPPP", board.printRank(board.rank7));

        String blankRank = addNewLine("........");
        String boardRep =
                addNewLine("........") +
                addNewLine("PPPPPPPP") +
                blankRank + blankRank +
                blankRank + blankRank +
                addNewLine("pppppppp") +
                addNewLine("........");

        //System.out.println(board.print());
        assertEquals(boardRep, board.print());
    }

}
