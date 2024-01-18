package chess;

import pieces.Pawn;
import java.util.ArrayList;

/**
 * A class that represents a Chess Board containing a number
 * of Pieces in 8 Ranks
 * @author emaph
 */
class ChessBoard {
    private ArrayList<Pawn> rank2 = new ArrayList<Pawn>(8);
    private ArrayList<Pawn> rank7 = new ArrayList<Pawn>(8);

    public ChessBoard() {
        initalize();
    }

    /**
     * Initialize the Board with Piece by Rank.
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

    /**
     * Print the given rank.
     * @param rank
     * @return rank in printable form
     */
    private String printRank(ArrayList<Pawn> rank) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < rank.size(); i++) {
            Pawn piece = rank.get(i);
            if (piece != null)
                build.append(piece.getRepresentation());
            else
                build.append('.');
        }
        return build.toString();
    }

    public String printRank2() {
        return printRank(rank2);
    }

    public String printRank7() {
        return printRank(rank7);
    }

    public String printBoard() {
        StringBuilder builder = new StringBuilder();

        builder.append("........");
        builder.append('\n');
        builder.append(printRank7());
        builder.append('\n');
        builder.append("........");
        builder.append('\n');
        builder.append("........");
        builder.append('\n');
        builder.append("........");
        builder.append('\n');
        builder.append("........");
        builder.append('\n');
        builder.append(printRank2());
        builder.append('\n');
        builder.append("........");

        return builder.toString();
    }
}
