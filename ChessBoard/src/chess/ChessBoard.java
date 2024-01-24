package chess;

import pieces.Piece;
import java.util.ArrayList;
import static util.StringUtil.addNewLine;

/**
 * A class that represents a Chess Board containing a number
 * of Pieces in 8 Ranks
 * @author emaph
 */
class ChessBoard {
    public ArrayList<Piece> rank2 = new ArrayList<Piece>(8);
    public ArrayList<Piece> rank7 = new ArrayList<Piece>(8);

    public ChessBoard() {
        //initalize();
    }

    /**
     * Initialize the Board with Piece by Rank.
     */
    public final void initalize() {
        rank2 = intitalizePawnRank(Piece.WHITE);
        rank7 = intitalizePawnRank(Piece.BLACK);

    }

    private ArrayList<Piece> intitalizePawnRank(String color) {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.create(color, "pawn"));
        }
        return rank;
    }
    /**
     * Return current number of pieces board holds.
     * @return number of pieces
     */
    int getNumberPieces() {
        return rank2.size() + rank7.size();
    }


    /**
     * Lookup Piece based on index in a rank.
     * @param  rank of Piece
     * @param index of Piece
     * @return reference to Piece
     */
    public Piece getPiece(ArrayList<Piece> rank, int index) {
        return rank.get(index);
    }

    /**
     * Print the given rank.
     * @param rank
     * @return rank in printable form
     */
    public String printRank(ArrayList<Piece> rank) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < rank.size(); i++) {
            Piece piece = rank.get(i);
            build.append(piece.getRepresentation());
        }
        return build.toString();
    }

    public String print() {
        String board =
            addNewLine("........") +
            addNewLine(printRank(rank7)) +
            addNewLine("........") +
            addNewLine("........") +
            addNewLine("........") +
            addNewLine("........") +
            addNewLine(printRank(rank2)) +
            addNewLine("........");

        return board;
    }
}
