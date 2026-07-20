package chess;

import pieces.Piece;
import java.util.*;
import static util.StringUtil.addNewLine;
import static pieces.Piece.Color.WHITE;
import static pieces.Piece.Color.BLACK;

//Piece.Color.WHITE

/**
 * A class that represents a Chess Board containing a number
 * of Pieces in 8 Ranks
 * @author emaph
 */
class ChessBoard {
    public List<Piece> rank8;
    public List<Piece> rank7;
    public List<Piece> rank6;
    public List<Piece> rank5;
    public List<Piece> rank4;
    public List<Piece> rank3;
    public List<Piece> rank2;
    public List<Piece> rank1;

    public ChessBoard() {
        initializeEmptyBoard();
    }

    /**
     * Initialize ChessBoard with all empty Pieces.
     */
    public final void initializeEmptyBoard() {
        Piece.resetPieceCounts();
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
        updatePieceRank(rank1, WHITE);
        updatePawnRank(rank2, WHITE);
        updatePawnRank(rank7, BLACK);
        updatePieceRank(rank8, BLACK);
    }

    private void updatePawnRank(List<Piece> rank, Piece.Color color) {
        for (int i = 0; i < rank.size(); i++) {
            rank.set(i, Piece.createPawn(color));
        }
    }

    private void updatePieceRank(List<Piece> rank, Piece.Color color) {
        rank.set(0, Piece.createRook(color));
        rank.set(1, Piece.createKnight(color));
        rank.set(2, Piece.createBishop(color));
        rank.set(3, Piece.createQueen(color));
        rank.set(4, Piece.createKing(color));
        rank.set(5, Piece.createBishop(color));
        rank.set(6, Piece.createKnight(color));
        rank.set(7, Piece.createRook(color));
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
      //  System.out.println("count = " + number);
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
            if (!piece.isBlank())
                count++;
        }

        return count;
    }

    /**
     * Lookup Piece based on index in a rank.
     * @param rank of Piece
     * @param index of Piece
     * @return reference to Piece
     */
    public Piece getPieceInRank(List<Piece> rank, int index) {
        return rank.get(index);
    }

    /**
     * Print the given rank.
     * @param rank
     * @return rank in printable form
     */
    public String printRank(List<Piece> rank) {
        StringBuilder build = new StringBuilder();
        for (Piece piece : rank)
            build.append(piece.getRepresentation());
        return build.toString();
    }

    /**
     * Produce a string representation of the ChessBoard from the perspective of WHITE
     * @return String representation of board.
     */
    public String print() {
        StringBuilder builder = new StringBuilder();
        builder.append(addNewLine(printRank(rank8)));
        builder.append(addNewLine(printRank(rank7)));
        builder.append(addNewLine(printRank(rank6)));
        builder.append(addNewLine(printRank(rank5)));
        builder.append(addNewLine(printRank(rank4)));
        builder.append(addNewLine(printRank(rank3)));
        builder.append(addNewLine(printRank(rank2)));
        builder.append(addNewLine(printRank(rank1)));

        return builder.toString();
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
    public int countPieces(Piece.Color color, char representation) {
        int number =
                countPiecesByRank(rank1, color, representation) +
                countPiecesByRank(rank2, color, representation) +
                countPiecesByRank(rank3, color, representation) +
                countPiecesByRank(rank4, color, representation) +
                countPiecesByRank(rank5, color, representation) +
                countPiecesByRank(rank6, color, representation) +
                countPiecesByRank(rank7, color, representation) +
                countPiecesByRank(rank8, color, representation);
        return number;
    }

    private int countPiecesByRank(List<Piece> rank, Piece.Color color, char represntation) {
        int count = 0;
        for (Piece piece : rank) {
            if (piece.getType() != Piece.Type.NO_PIECE) {
                char rep = piece.getRepresentation();
                if (piece.getColor() == BLACK)
                    rep = Character.toLowerCase(rep);
                if (piece.getColor() == color && rep == represntation) {
                    count++;
                }
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
    public Piece getPiece(String coordinates) {
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
