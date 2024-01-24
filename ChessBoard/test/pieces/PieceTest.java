package pieces;

import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PieceTest extends TestCase {

   public void testCreate() {
        Piece wPawn = Piece.create(Piece.WHITE, Piece.PAWN);
        assertEquals(Piece.WHITE, wPawn.getColor());
        assertEquals('p', wPawn.getRepresentation());

        Piece bPawn = Piece.create(Piece.BLACK, Piece.PAWN);
        assertEquals(Piece.BLACK, bPawn.getColor());
        assertEquals('P', bPawn.getRepresentation());

        Piece wRook = Piece.create(Piece.WHITE, Piece.ROOK);
        assertEquals(Piece.WHITE, wRook.getColor());
        assertEquals('r', wRook.getRepresentation());

        Piece bRook = Piece.create(Piece.BLACK, Piece.ROOK);
        assertEquals(Piece.BLACK, bRook.getColor());
        assertEquals('R', bRook.getRepresentation());

        Piece wKnight = Piece.create(Piece.WHITE, Piece.KNIGHT);
        assertEquals(Piece.WHITE, wKnight.getColor());
        assertEquals('n', wKnight.getRepresentation());

        Piece bKnight = Piece.create(Piece.BLACK, Piece.KNIGHT);
        assertEquals(Piece.BLACK, bKnight.getColor());
        assertEquals('N', bKnight.getRepresentation());

        Piece wBishop = Piece.create(Piece.WHITE, Piece.BISHOP);
        assertEquals(Piece.WHITE, wBishop.getColor());
        assertEquals('b', wBishop.getRepresentation());

        Piece bBishop = Piece.create(Piece.BLACK, Piece.BISHOP);
        assertEquals(Piece.BLACK, bBishop.getColor());
        assertEquals('B', bBishop.getRepresentation());

        Piece wQueen = Piece.create(Piece.WHITE, Piece.QUEEN);
        assertEquals(Piece.WHITE, wQueen.getColor());
        assertEquals('q', wQueen.getRepresentation());

        Piece bQueen = Piece.create(Piece.BLACK, Piece.QUEEN);
        assertEquals(Piece.BLACK, bQueen.getColor());
        assertEquals('Q', bQueen.getRepresentation());

        Piece wKing = Piece.create(Piece.WHITE, Piece.KING);
        assertEquals(Piece.WHITE, wQueen.getColor());
        assertEquals('k', wKing.getRepresentation());

        Piece bKing = Piece.create(Piece.BLACK, Piece.KING);
        assertEquals(Piece.BLACK, bKing.getColor());
        assertEquals('K', bKing.getRepresentation());

        assertEquals(Piece.WHITE, wPawn.getColor());
        assertEquals('p', wPawn.getRepresentation());
    }

   public void testIsBlackIsWhite() {
       Piece white = Piece.create(Piece.WHITE, Piece.PAWN);
       Piece black = Piece.create(Piece.BLACK, Piece.PAWN);

       assertTrue(white.isWhite());
       assertFalse(white.isBlack());
       assertTrue(black.isBlack());
       assertFalse(black.isWhite());
   }

}
