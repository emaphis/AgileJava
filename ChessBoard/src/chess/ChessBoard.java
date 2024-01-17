package chess;

import pieces.Pawn;
import java.util.ArrayList;

/**
 * A class that represents a Chess Board containing a number
 * of Pieces in 8 Ranks
 * @author emaph
 */
class ChessBoard {
    public ArrayList<Pawn> rank2 = new ArrayList<Pawn>();
    public ArrayList<Pawn> rank7 = new ArrayList<Pawn>();

    public ChessBoard() {
        initalize();
    }

    /**
     * Initialize Boards Piece Ranks lists
     */
    private final void initalize() {
        addPiece(rank2, new Pawn());
        addPiece(rank2, new Pawn());
        addPiece(rank2, new Pawn());
        addPiece(rank2, new Pawn());
        addPiece(rank2, new Pawn());
        addPiece(rank2, new Pawn());
        addPiece(rank2, new Pawn());
        addPiece(rank2, new Pawn());

        addPiece(rank7, new Pawn(Pawn.BLACK, 'P'));
        addPiece(rank7, new Pawn(Pawn.BLACK, 'P'));
        addPiece(rank7, new Pawn(Pawn.BLACK, 'P'));
        addPiece(rank7, new Pawn(Pawn.BLACK, 'P'));
        addPiece(rank7, new Pawn(Pawn.BLACK, 'P'));
        addPiece(rank7, new Pawn(Pawn.BLACK, 'P'));
        addPiece(rank7, new Pawn(Pawn.BLACK, 'P'));
        addPiece(rank7, new Pawn(Pawn.BLACK, 'P'));
    }

    /**
     * Return current number of pieces board holds.
     * @return number of pieces
     */
    int getNumberPieces() {
        return rank2.size() + rank7.size();
    }

    /**
     * Add a Pawn to the board in rank2
     * @param piece
     */
    private void addPiece(ArrayList<Pawn> rank, Pawn piece) {
        rank.add(piece);
    }


    /**
     * Lookup Piece based on index in a rank.
     * @param  rank of Piece
     * @param index of Piece
     * @return reference to Piece
     */
    public Pawn getPiece(ArrayList<Pawn> rank, int index) {
        return rank.get(index);
    }

    public String printRank(ArrayList<Pawn> rank) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < rank.size(); i++) {
            build.append(rank.get(i).getRepresentation());
        }
        return build.toString();
    }

}
