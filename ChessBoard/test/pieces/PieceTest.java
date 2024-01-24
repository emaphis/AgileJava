package pieces;

import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PieceTest extends TestCase {

   public void testCreate() {
        Piece wPawn = Piece.create(Piece.WHITE, "pawn");
        assertEquals(Piece.WHITE, wPawn.getColor());
        assertEquals('p', wPawn.getRepresentation());

        Piece bPawn = Piece.create(Piece.BLACK, "pawn");
        assertEquals(Piece.BLACK, bPawn.getColor());
        assertEquals('P', bPawn.getRepresentation());

        Piece wRook = Piece.create(Piece.WHITE, "rook");
        assertEquals(Piece.WHITE, wRook.getColor());
        assertEquals('r', wRook.getRepresentation());

        Piece bRook = Piece.create(Piece.BLACK, "rook");
        assertEquals(Piece.BLACK, bRook.getColor());
        assertEquals('R', bRook.getRepresentation());

        Piece wKnight = Piece.create(Piece.WHITE, "knight");
        assertEquals(Piece.WHITE, wKnight.getColor());
        assertEquals('n', wKnight.getRepresentation());

        Piece bKnight = Piece.create(Piece.BLACK, "knight");
        assertEquals(Piece.BLACK, bKnight.getColor());
        assertEquals('N', bKnight.getRepresentation());

        Piece wBishop = Piece.create(Piece.WHITE, "bishop");
        assertEquals(Piece.WHITE, wBishop.getColor());
        assertEquals('b', wBishop.getRepresentation());

        Piece bBishop = Piece.create(Piece.BLACK, "bishop");
        assertEquals(Piece.BLACK, bBishop.getColor());
        assertEquals('B', bBishop.getRepresentation());

        Piece wQueen = Piece.create(Piece.WHITE, "queen");
        assertEquals(Piece.WHITE, wQueen.getColor());
        assertEquals('q', wQueen.getRepresentation());

        Piece bQueen = Piece.create(Piece.BLACK, "queen");
        assertEquals(Piece.BLACK, bQueen.getColor());
        assertEquals('Q', bQueen.getRepresentation());

        Piece wKing = Piece.create(Piece.WHITE, "king");
        assertEquals(Piece.WHITE, wQueen.getColor());
        assertEquals('k', wKing.getRepresentation());

        Piece bKing = Piece.create(Piece.BLACK, "king");
        assertEquals(Piece.BLACK, bKing.getColor());
        assertEquals('K', bKing.getRepresentation());

        assertEquals(Piece.WHITE, wPawn.getColor());
        assertEquals('p', wPawn.getRepresentation());
    }

}
