package chess;

import pieces.Piece;
import java.util.*;
import static util.StringUtil.addNewLine;

/**
 * A class that represents a Chess Board containing a number
 * of Pieces in 8 Ranks
 * @author emaph
 */
class ChessBoard {
    public List<Piece> rank1;
    public List<Piece> rank2;
    public List<Piece> rank3;
    public List<Piece> rank4;
    public List<Piece> rank5;
    public List<Piece> rank6;
    public List<Piece> rank7;
    public List<Piece> rank8;

    public ChessBoard() {
        //initalize();
    }

    /**
     * Initialize the Board with Piece by Rank.
     */
    public final void initalize() {
        rank1 = initializeWhitePieceRank();
        rank2 = intitalizeWhitePawnRank();
        rank3 = initializeEmptyRank();
        rank4 = initializeEmptyRank();
        rank5 = initializeEmptyRank();
        rank6 = initializeEmptyRank();
        rank7 = intitalizeBlackPawnRank();
        rank8 = initializeBlackPieceRank();
    }

    private List<Piece> intitalizeWhitePawnRank() {
        List<Piece> rank = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createWhitePawn());
        }
        return rank;
    }

    private List<Piece> intitalizeBlackPawnRank() {
        List<Piece> rank = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createBlackPawn());
        }
        return rank;
    }

    private List<Piece> initializeWhitePieceRank() {
        List<Piece> rank = new ArrayList<Piece>();
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

    private List<Piece> initializeBlackPieceRank() {
        List<Piece> rank = new ArrayList<Piece>();
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

    private List<Piece> initializeEmptyRank() {
        List rank = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.noPiece());
        }
        return rank;
    }

    /**
     * Return current number of pieces board holds.
     * @return number of pieces
     */
    int getNumberPieces() {
        int number =
                getNumberOfPiecesInRank(rank1) +
                getNumberOfPiecesInRank(rank2) +
                getNumberOfPiecesInRank(rank3) +
                getNumberOfPiecesInRank(rank4) +
                getNumberOfPiecesInRank(rank5) +
                getNumberOfPiecesInRank(rank6) +
                getNumberOfPiecesInRank(rank7) +
                getNumberOfPiecesInRank(rank8);
        return number;
    }

    /**
     * Return number of Pieces in a rank
     * @param rank
     * @return
     */
    private int getNumberOfPiecesInRank(List<Piece> rank) {
        int count = 0;
        for (Piece piece : rank) {
            if (piece.getRepresentation() != Piece.BLANK_REPRESENTATION)
                count++;
        }
        return count;
    }

    /**
     * Lookup Piece based on index in a rank.
     * @param  rank of Piece
     * @param index of Piece
     * @return reference to Piece
     */
    public Piece getPiece(List<Piece> rank, int index) {
        return rank.get(index);
    }

    /**
     * Print the given rank.
     * @param rank
     * @return rank in printable form
     */
    public String printRank(List<Piece> rank) {
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
            addNewLine(printRank(rank6)) +
            addNewLine(printRank(rank5)) +
            addNewLine(printRank(rank4)) +
            addNewLine(printRank(rank3)) +
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
