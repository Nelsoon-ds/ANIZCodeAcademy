package TrinketExercises;

public class Tile {
    char letter;
    int value;

    public static void main(String[] args) {
        Tile t1 = new Tile();
        Tile t2 = new Tile('Ø', 40);
        t1.printTile(t1);
        String s = t1.toString();
        System.out.println(s);
        System.out.println("Hashcode: " + s.hashCode());
        System.out.println(t1.equals(t2));
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    public Tile() {
        this.letter = 'Z';
        this.value = 10;
    }
    public char getLetter( ) {

        return this.letter;
    }

    public int getValue() {

        return this.value;
    }
    public void printTile(Tile object) {
        System.out.println(object.letter + " " + object.value);
    }

    public String toString() {
        return String.format("Character: %c, Value: %d", this.letter, this.value);
    }
    public boolean equals(Tile that) {
        boolean isEqual;
        if (that == null) {
            return false;
        }
        if (this.value == that.value && this.letter == that.letter) {
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }
}
