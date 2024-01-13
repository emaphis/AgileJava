
/**
 * A class to represent pawns
 * @author emaph
 */
class Pawn {
    private String color;

    Pawn() {
        this.color = "white";
    }

    public Pawn(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
