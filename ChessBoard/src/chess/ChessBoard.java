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
    private ArrayList<Piece> rank2 = new ArrayList<Piece>(8);
    private ArrayList<Piece> rank7 = new ArrayList<Piece>(8);

    public ChessBoard() {
        initalize();
    }

    /**
     * Initialize the Board with Piece by Rank.
     */
    private final void initalize() {
        addPiece(rank2, Piece.create(Piece.WHITE, "pawn"));
        addPiece(rank2, Piece.create(Piece.WHITE, "pawn"));
        addPiece(rank2, Piece.create(Piece.WHITE, "pawn"));
        addPiece(rank2, Piece.create(Piece.WHITE, "pawn"));
        addPiece(rank2, Piece.create(Piece.WHITE, "pawn"));
        addPiece(rank2, Piece.create(Piece.WHITE, "pawn"));
        addPiece(rank2, Piece.create(Piece.WHITE, "pawn"));
        addPiece(rank2, Piece.create(Piece.WHITE, "pawn"));

        addPiece(rank7, Piece.create(Piece.BLACK, "pawn"));
        addPiece(rank7, Piece.create(Piece.BLACK, "pawn"));
        addPiece(rank7, Piece.create(Piece.BLACK, "pawn"));
        addPiece(rank7, Piece.create(Piece.BLACK, "pawn"));
        addPiece(rank7, Piece.create(Piece.BLACK, "pawn"));
        addPiece(rank7, Piece.create(Piece.BLACK, "pawn"));
        addPiece(rank7, Piece.create(Piece.BLACK, "pawn"));
        addPiece(rank7, Piece.create(Piece.BLACK, "pawn"));
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
    private void addPiece(ArrayList<Piece> rank, Piece piece) {
        rank.add(piece);
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
    private String printRank(ArrayList<Piece> rank) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < rank.size(); i++) {
            Piece piece = rank.get(i);
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
        String board =
            addNewLine("........") +
            addNewLine(printRank7()) +
            addNewLine("........") +
            addNewLine("........") +
            addNewLine("........") +
            addNewLine("........") +
            addNewLine(printRank2()) +
            addNewLine("........");

        return board;
    }
}
