package TrinketExercises;

public class Tile {
    char letter;
    int value;

    public static void main(String[] args) {
        Tile t1 = new Tile();
        t1.printTile(t1);
        String s = t1.toString();
        System.out.println(s);
        System.out.println("Hashcode: " + s.hashCode());
    }

    public Tile(char letter, int value) {
        letter = this.letter;
        value = this.value;
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
        return this.value == that.value && this.letter == that.letter;
    }
}
