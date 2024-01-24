
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
        board.initalize();
    }

    public void testCreate() {
        assertEquals(32, board.getNumberPieces());
        assertEquals(16, board.getNumberWhitePieces());
        assertEquals(16, board.getNumberBlackPieces());

        assertEquals("pppppppp", board.printRank(board.rank2));
        assertEquals("PPPPPPPP", board.printRank(board.rank7));
        assertEquals("rnbqkbnr", board.printRank(board.rank1));
        assertEquals("RNBQKBNR", board.printRank(board.rank8));
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

}
