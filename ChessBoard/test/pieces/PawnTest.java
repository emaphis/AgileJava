package pieces;

import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PawnTest extends TestCase {

   public void testCreate() {
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE, pawn.getColor());
        assertEquals('p', pawn.getRepresentation());

        Pawn blackPawn = new Pawn(Pawn.BLACK, 'P');
        assertEquals(Pawn.BLACK, blackPawn.getColor());
        assertEquals('P', blackPawn.getRepresentation());

        assertEquals(Pawn.WHITE, pawn.getColor());
        assertEquals('p', pawn.getRepresentation());
    }

    public void testCreatePawnDefaultConstructor() {
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE, pawn.getColor());
    }
}
