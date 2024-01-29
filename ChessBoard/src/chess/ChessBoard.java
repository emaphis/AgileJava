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
        initializeEmptyBoard();
    }

    /**
     * Initialize ChessBoard with all empty Pieces.
     */
    public final void initializeEmptyBoard() {
        rank1 = initializeEmptyRank();
        rank2 = initializeEmptyRank();
        rank3 = initializeEmptyRank();
        rank4 = initializeEmptyRank();
        rank5 = initializeEmptyRank();
        rank6 = initializeEmptyRank();
        rank7 = initializeEmptyRank();
        rank8 = initializeEmptyRank();
    }

    /**
     * Initialize the Board with Piece by Rank.
     */
    public final void initalize() {
        updateWhitePieceRank(rank1);
        updateWhitePawnRank(rank2);
        updateBlackPawnRank(rank7);
        updateBlackPieceRank(rank8);
    }

    private void updateWhitePawnRank(List<Piece> rank) {
        for (int i = 0; i < rank.size(); i++) {
            rank.set(i, Piece.createWhitePawn());
        }
    }

    private void updateBlackPawnRank(List<Piece> rank) {
        for (int i = 0; i < 8; i++) {
            rank.set(i, Piece.createBlackPawn());
        }
    }

    private void updateWhitePieceRank(List<Piece> rank) {
        rank.set(0, Piece.createWhiteRook());
        rank.set(1, Piece.createWhiteKnight());
        rank.set(2, Piece.createWhiteBishop());
        rank.set(3, Piece.createWhiteQueen());
        rank.set(4, Piece.createWhiteKing());
        rank.set(5, Piece.createWhiteBishop());
        rank.set(6, Piece.createWhiteKnight());
        rank.set(7, Piece.createWhiteRook());
    }

    private void updateBlackPieceRank(List<Piece> rank) {
        rank.set(0, Piece.createBlackRook());
        rank.set(1, Piece.createBlackKnight());
        rank.set(2, Piece.createBlackBishop());
        rank.set(3, Piece.createBlackQueen());
        rank.set(4, Piece.createBlackKing());
        rank.set(5, Piece.createBlackBishop());
        rank.set(6, Piece.createBlackKnight());
        rank.set(7, Piece.createBlackRook());
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
            if (piece.getType() != Piece.Type.NO_PIECE)
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

    /**
     * Return the number of a given Piece color and representation on the ChessBoard
     *
     * @param color of Piece
     * @param representation
     * @return number of Pieces
     */
    public int getNumberPieces(Piece.Colors color, char representation) {
        int number =
                getNumberPiecesByRank(rank1, color, representation) +
                getNumberPiecesByRank(rank2, color, representation) +
                getNumberPiecesByRank(rank3, color, representation) +
                getNumberPiecesByRank(rank4, color, representation) +
                getNumberPiecesByRank(rank5, color, representation) +
                getNumberPiecesByRank(rank6, color, representation) +
                getNumberPiecesByRank(rank7, color, representation) +
                getNumberPiecesByRank(rank8, color, representation);
        return number;
    }

    private int getNumberPiecesByRank(List<Piece> rank, Piece.Colors color, char represntation) {
        int count = 0;
        for (Piece piece : rank) {
            if (piece.getType() == Piece.Type.NO_PIECE)
                continue;
            char rep = piece.getRepresentation();
            if (piece.getColor() == Piece.Colors.BLACK)
                rep = Character.toLowerCase(rep);
            if (piece.getColor() == color && rep == represntation) {
                count++;
            }
        }
        return count;
    }

    /**
     * Get Piece at ChessBoard location from white perspective.
     *
     *   R N B Q K B N R  8 (rank 8)
     *   P P P P P P P P  7
     *   . . . . . . . .  6
     *   . . . . . . . .  5
     *   . . . . . . . .  4
     *   . . . . . . . .  3
     *   p p p p p p p p  2
     *   r n b q k b n r  1 (rank 1)
     *
     *   a b c d e f g h
     *
     * @param coordinate
     * @return
     */
    public Piece getPieceWhite(String coordinates) {
        int column = coordinates.charAt(0) - 96 - 1;
        int rank = Character.getNumericValue(coordinates.charAt(1));

       // System.out.println("c=" + column + " r=" + rank);

        Piece piece = null;

        if (rank == 1)
            piece = rank1.get(column);
        else if (rank == 2)
            piece = rank2.get(column);
        else if (rank == 3)
            piece = rank3.get(column);
        else if (rank == 4)
            piece = rank4.get(column);
        else if (rank == 5)
            piece = rank5.get(column);
        else if (rank == 6)
            piece = rank6.get(column);
        else if (rank == 7)
            piece = rank7.get(column);
        else if (rank == 8)
            piece = rank8.get(column);

        Character.getNumericValue('1');

        return piece;
    }
}
