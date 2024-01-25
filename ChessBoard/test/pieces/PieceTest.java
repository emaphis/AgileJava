package pieces;

import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PieceTest extends TestCase {

   public void testCreate() {
        Piece wPawn = Piece.createWhitePawn();
        assertTrue(wPawn.isWhite());
        assertEquals('p', wPawn.getRepresentation());

        Piece bPawn = Piece.createBlackPawn();
        assertTrue(bPawn.isBlack());
        assertEquals('P', bPawn.getRepresentation());

        Piece wRook = Piece.createWhiteRook();
        assertEquals('r', wRook.getRepresentation());

        Piece bRook = Piece.createBlackRook();
        assertEquals('R', bRook.getRepresentation());

        Piece wKnight = Piece.createWhiteKnight();
        assertEquals('n', wKnight.getRepresentation());

        Piece bKnight = Piece.createBlackKnight();
        assertEquals('N', bKnight.getRepresentation());

        Piece wBishop = Piece.createWhiteBishop();
        assertEquals('b', wBishop.getRepresentation());

        Piece bBishop = Piece.createBlackBishop();
        assertEquals('B', bBishop.getRepresentation());

        Piece wQueen = Piece.createWhiteQueen();
        assertEquals('q', wQueen.getRepresentation());

        Piece bQueen = Piece.createBlackQueen();
        assertEquals('Q', bQueen.getRepresentation());

        Piece wKing = Piece.createWhiteKing();
        assertEquals('k', wKing.getRepresentation());

        Piece bKing = Piece.createBlackKing();
        assertEquals('K', bKing.getRepresentation());

        assertEquals('p', wPawn.getRepresentation());
    }

   public void testIsBlackIsWhite() {
       Piece white = Piece.createWhitePawn();
       Piece black = Piece.createBlackPawn();

       assertTrue(white.isWhite());
       assertFalse(white.isBlack());
       assertTrue(black.isBlack());
       assertFalse(black.isWhite());
   }

}
