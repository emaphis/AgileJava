package pieces;

import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PieceTest extends TestCase {

   public void testCreate() {
        Piece pawn = new Piece();
        assertEquals(Piece.WHITE, pawn.getColor());
        assertEquals('p', pawn.getRepresentation());

        Piece blackPawn = new Piece(Piece.BLACK, "pawn");
        assertEquals(Piece.BLACK, blackPawn.getColor());
        assertEquals('P', blackPawn.getRepresentation());

        assertEquals(Piece.WHITE, pawn.getColor());
        assertEquals('p', pawn.getRepresentation());
    }

    public void testCreatePawnDefaultConstructor() {
        Piece pawn = new Piece();
        assertEquals(Piece.WHITE, pawn.getColor());
    }
}
