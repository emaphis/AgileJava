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
    public ArrayList<Piece> rank1;
    public ArrayList<Piece> rank2;
    public ArrayList<Piece> rank7;
    public ArrayList<Piece> rank8;

    public ChessBoard() {
        //initalize();
    }

    /**
     * Initialize the Board with Piece by Rank.
     */
    public final void initalize() {
        rank1 = initializeWhitePieceRank();
        rank2 = intitalizeWhitePawnRank();
        rank7 = intitalizeBlackPawnRank();
        rank8 = initializeBlackPieceRank();
    }

    private ArrayList<Piece> intitalizeWhitePawnRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createWhitePawn());
        }
        return rank;
    }

    private ArrayList<Piece> intitalizeBlackPawnRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createBlackPawn());
        }
        return rank;
    }

    private ArrayList<Piece> initializeWhitePieceRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createWhiteRook());
        rank.add(Piece.createWhiteKnight());
        rank.add(Piece.createWhiteBishop());
        rank.add(Piece.createWhiteQueen());
        rank.add(Piece.createWhiteKing());
        rank.add(Piece.createWhiteBishop());
        rank.add(Piece.createWhiteKnight());
        rank.add(Piece.createWhiteRook());
        return rank;
    }

    private ArrayList<Piece> initializeBlackPieceRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createBlackRook());
        rank.add(Piece.createBlackKnight());
        rank.add(Piece.createBlackBishop());
        rank.add(Piece.createBlackQueen());
        rank.add(Piece.createBlackKing());
        rank.add(Piece.createBlackBishop());
        rank.add(Piece.createBlackKnight());
        rank.add(Piece.createBlackRook());
        return rank;
    }

    /**
     * Return current number of pieces board holds.
     * @return number of pieces
     */
    int getNumberPieces() {
        return rank1.size() + rank2.size() + rank7.size() + rank8.size();
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
            addNewLine(printRank(rank8)) +
            addNewLine(printRank(rank7)) +
            addNewLine("........") +
            addNewLine("........") +
            addNewLine("........") +
            addNewLine("........") +
            addNewLine(printRank(rank2)) +
            addNewLine(printRank(rank1));

        return board;
    }

    public int getNumberWhitePieces() {
        return Piece.getWhiteCount();
    }

    public int getNumberBlackPieces() {
        return Piece.getBlackCount();
    }
}
