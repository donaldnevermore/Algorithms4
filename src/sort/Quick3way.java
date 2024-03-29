package sort;

public class Quick3way {
    private static <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int lt = lo;
        int i = lo + 1;
        int gt = hi;
        T v = a[lo];

        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                Util.exch(a, lt++, i++);
            } else if (cmp > 0) {
                Util.exch(a, i, gt--);
            } else {
                i++;
            }
        }

        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }
}
