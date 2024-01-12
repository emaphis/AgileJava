import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PawnTest extends TestCase {

    public void testCreate() {
        final String white = "white";
        final String black = "black";

        Pawn pawn = new Pawn(white);
        assertEquals(white, pawn.getColor());

        Pawn blackPawn = new Pawn(black);
        assertEquals(black, blackPawn.getColor());

        assertEquals(white, pawn.getColor());
    }

}
