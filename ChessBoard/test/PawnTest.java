import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PawnTest extends TestCase {
   final String white = "white";
   final String black = "black";

   public void testCreate() {
        Pawn pawn = new Pawn(white);
        assertEquals(white, pawn.getColor());

        Pawn blackPawn = new Pawn(black);
        assertEquals(black, blackPawn.getColor());

        assertEquals(white, pawn.getColor());
    }

    public void testCreatePawnDefaultConstructor() {
        Pawn pawn = new Pawn();
        assertEquals(white, pawn.getColor());
    }
}
