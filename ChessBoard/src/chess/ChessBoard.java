package chess;

import pieces.Pawn;
import java.util.ArrayList;

/**
 * A class that represents a Chess Board containing a number
 * of Pawns
 * @author emaph
 */
class ChessBoard {
    private ArrayList<Pawn> pieces = new ArrayList<Pawn>();

    public ChessBoard() {
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());

        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
        addPiece(new Pawn());
    }

    /**
     * Return current number of pieces board holds.
     * @return number of pieces
     */
    int getNumberPieces() {
        return pieces.size();
    }

    /**
     * Add a Pawn to the board
     * @param piece
     */
    private final void addPiece(Pawn piece) {
        pieces.add(piece);
    }

    /**
     * Lookup Piece based on index.
     * @param index of Piece
     * @return reference to Piece
     */
    Pawn getPiece(int index) {
        return pieces.get(index);
    }

}
