package run;

public final class Basic {

    {
        System.out.println("普通语句块");
    }

    // public static Integer valueOf(int i) {
    // if (i >= IntegerCache.low && i <= IntegerCache.high) {
    // return IntegerCache.cache[i + (-IntegerCache.low)];
    // }
    // return new Integer(i);
    // }
    private int x;
    private int y;
    private int z;

    public Basic(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Basic that = (Basic) o;

        if (x != that.x) {
            return false;
        }
        if (y != that.y) {
            return false;
        }
        return z == that.z;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }
}
