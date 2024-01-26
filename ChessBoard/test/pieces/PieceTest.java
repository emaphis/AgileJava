package pieces;

import junit.framework.TestCase;

/**
 * Test the Pawn class
 * @author emaph
 */
public class PieceTest extends TestCase {

   public void testCreate() {
        Piece wPawn = Piece.createWhitePawn();
        Piece bPawn = Piece.createBlackPawn();
        verifyCreation(wPawn, bPawn, Piece.Type.PAWN, 'p');

        Piece wRook = Piece.createWhiteRook();
        Piece bRook = Piece.createBlackRook();
        verifyCreation(wRook, bRook, Piece.Type.ROOK, 'r');

        Piece wKnight = Piece.createWhiteKnight();
        Piece bKnight = Piece.createBlackKnight();
        verifyCreation(wKnight, bKnight, Piece.Type.KNIGHT, 'n');

        Piece wBishop = Piece.createWhiteBishop();
        Piece bBishop = Piece.createBlackBishop();
        verifyCreation(wBishop, bBishop, Piece.Type.BISHOP, 'b');

        Piece wQueen = Piece.createWhiteQueen();
        Piece bQueen = Piece.createBlackQueen();
        verifyCreation(wQueen, bQueen, Piece.Type.QUEEN, 'q');

        Piece wKing = Piece.createWhiteKing();
        Piece bKing = Piece.createBlackKing();
        verifyCreation(wKing, bKing, Piece.Type.KING, 'k');


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

}
