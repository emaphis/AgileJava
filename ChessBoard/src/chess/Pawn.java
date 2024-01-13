package chess;

/**
 * A class to represent pawns
 * @author emaph
 */
class Pawn {
    static final String WHITE = "white";
    static final String BLACK = "black";

    private String color;

    Pawn() {
            this.color = this.WHITE;
    }

    public Pawn(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
