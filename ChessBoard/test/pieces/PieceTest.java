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
        verifyCreation(wPawn, bPawn, Piece.Type.PAWN, Piece.PAWN_REPRESENTATION);

        Piece wRook = Piece.createWhiteRook();
        Piece bRook = Piece.createBlackRook();
        verifyCreation(wRook, bRook, Piece.Type.ROOK, Piece.ROOK_REPRESENTATION);

        Piece wKnight = Piece.createWhiteKnight();
        Piece bKnight = Piece.createBlackKnight();
        verifyCreation(wKnight, bKnight, Piece.Type.KNIGHT, Piece.KNIGHT_REPRESENTATION);

        Piece wBishop = Piece.createWhiteBishop();
        Piece bBishop = Piece.createBlackBishop();
        verifyCreation(wBishop, bBishop, Piece.Type.BISHOP, Piece.BISHOP_REPRESENTATION);

        Piece wQueen = Piece.createWhiteQueen();
        Piece bQueen = Piece.createBlackQueen();
        verifyCreation(wQueen, bQueen, Piece.Type.QUEEN, Piece.QUEEN_REPRESENTATION);

        Piece wKing = Piece.createWhiteKing();
        Piece bKing = Piece.createBlackKing();
        verifyCreation(wKing, bKing, Piece.Type.KING, Piece.KING_REPRESENTATION);


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
