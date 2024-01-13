import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PawnTest extends TestCase {

   public void testCreate() {
        Pawn pawn = new Pawn(Pawn.WHITE);
        assertEquals(Pawn.WHITE, pawn.getColor());

        Pawn blackPawn = new Pawn(Pawn.BLACK);
        assertEquals(Pawn.BLACK, blackPawn.getColor());

        assertEquals(Pawn.WHITE, pawn.getColor());
    }

    public void testCreatePawnDefaultConstructor() {
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE, pawn.getColor());
    }
}
