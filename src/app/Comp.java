package app;

public class Comp implements Comparable<Comp> {
    private int value;

    public Comp(int value) {
        this.value = value;
    }

    public Comp() {
        super();
    }

    @Override
    public String toString() {
        return this.value + "";
    }

    @Override
    public int compareTo(Comp other) {
        if (value < other.value) {
            return -1;
        }
        else if (value == other.value) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
