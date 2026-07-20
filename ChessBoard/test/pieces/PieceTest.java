package pieces;

import junit.framework.TestCase;
import static pieces.Piece.Color.WHITE;
import static pieces.Piece.Color.BLACK;
import static pieces.Piece.Color.BLNK;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PieceTest extends TestCase {

   public void testCreate() {
        Piece wPawn = Piece.createPawn(WHITE);
        Piece bPawn = Piece.createPawn(BLACK);
        verifyCreation(wPawn, bPawn, Piece.Type.PAWN, Piece.PAWN_REPRESENTATION);

        Piece wRook = Piece.createRook(WHITE);
        Piece bRook = Piece.createRook(BLACK);
        verifyCreation(wRook, bRook, Piece.Type.ROOK, Piece.ROOK_REPRESENTATION);

        Piece wKnight = Piece.createKnight(WHITE);
        Piece bKnight = Piece.createKnight(BLACK);
        verifyCreation(wKnight, bKnight, Piece.Type.KNIGHT, Piece.KNIGHT_REPRESENTATION);

        Piece wBishop = Piece.createBishop(WHITE);
        Piece bBishop = Piece.createBishop(BLACK);
        verifyCreation(wBishop, bBishop, Piece.Type.BISHOP, Piece.BISHOP_REPRESENTATION);

        Piece wQueen = Piece.createQueen(WHITE);
        Piece bQueen = Piece.createQueen(BLACK);
        verifyCreation(wQueen, bQueen, Piece.Type.QUEEN, Piece.QUEEN_REPRESENTATION);

        Piece wKing = Piece.createKing(Piece.Color.WHITE);
        Piece bKing = Piece.createKing(Piece.Color.BLACK);
        verifyCreation(wKing, bKing, Piece.Type.KING, Piece.KING_REPRESENTATION);

        Piece blank = Piece.noPiece();
        assertEquals(Piece.BLANK_REPRESENTATION, blank.getRepresentation());
        assertEquals(Piece.Type.NO_PIECE, blank.getType());
    }

   private void verifyCreation(Piece whitePiece, Piece blackPiece,
           Piece.Type type, char representation) {
       assertTrue(whitePiece.isWhite());
       assertEquals(type, whitePiece.getType());
       assertEquals(representation, whitePiece.getRepresentation());

       assertTrue(blackPiece.isBlack());
       assertEquals(type, blackPiece.getType());
       char blackRepresentation = Character.toUpperCase(representation);
       assertEquals(blackRepresentation, blackPiece.getRepresentation());
   }

   public void testColorPredicates() {
        Piece pawn1 = Piece.createPawn(WHITE);
        Piece pawn2 = Piece.createPawn(BLACK);
        Piece empty = Piece.noPiece();

        assertTrue(pawn1.isWhite());
        assertFalse(pawn2.isWhite());

        assertFalse(pawn1.isBlack());
        assertTrue(pawn2.isBlack());

        assertFalse(empty.isWhite());
        assertFalse(empty.isBlack());

    }

}
