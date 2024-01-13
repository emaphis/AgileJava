package chess;

import java.util.ArrayList;

/**
 * A class that represents a Chess Board containing a number
 * of Pawns
 * @author emaph
 */
class ChessBoard {
    private ArrayList<Pawn> pieces = new ArrayList<Pawn>();

    public ChessBoard() {
    }

    int getNumberPieces() {
        return pieces.size();
    }

    void addPiece(Pawn piece) {
        pieces.add(piece);
    }

    Pawn getPiece(int index) {
        return pieces.get(index);
    }

}
