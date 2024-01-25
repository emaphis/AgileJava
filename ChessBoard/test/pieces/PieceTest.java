package pieces;

import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PieceTest extends TestCase {

   public void testCreate() {
        Piece wPawn = Piece.createWhite(Piece.PAWN);
        assertTrue(wPawn.isWhite());
        assertEquals('p', wPawn.getRepresentation());

        Piece bPawn = Piece.createBlack(Piece.PAWN);
        assertTrue(bPawn.isBlack());
        assertEquals('P', bPawn.getRepresentation());

        Piece wRook = Piece.createWhite(Piece.ROOK);
        assertEquals('r', wRook.getRepresentation());

        Piece bRook = Piece.createBlack( Piece.ROOK);
        assertEquals('R', bRook.getRepresentation());

        Piece wKnight = Piece.createWhite(Piece.KNIGHT);
        assertEquals('n', wKnight.getRepresentation());

        Piece bKnight = Piece.createBlack(Piece.KNIGHT);
        assertEquals('N', bKnight.getRepresentation());

        Piece wBishop = Piece.createWhite(Piece.BISHOP);
        assertEquals('b', wBishop.getRepresentation());

        Piece bBishop = Piece.createBlack(Piece.BISHOP);
        assertEquals('B', bBishop.getRepresentation());

        Piece wQueen = Piece.createWhite(Piece.QUEEN);
        assertEquals('q', wQueen.getRepresentation());

        Piece bQueen = Piece.createBlack(Piece.QUEEN);
        assertEquals('Q', bQueen.getRepresentation());

        Piece wKing = Piece.createWhite(Piece.KING);
        assertEquals('k', wKing.getRepresentation());

        Piece bKing = Piece.createBlack(Piece.KING);
        assertEquals('K', bKing.getRepresentation());

        assertEquals('p', wPawn.getRepresentation());
    }

   public void testIsBlackIsWhite() {
       Piece white = Piece.createWhite(Piece.PAWN);
       Piece black = Piece.createBlack(Piece.PAWN);

       assertTrue(white.isWhite());
       assertFalse(white.isBlack());
       assertTrue(black.isBlack());
       assertFalse(black.isWhite());
   }

}
