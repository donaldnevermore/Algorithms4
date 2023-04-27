package sort;

public class Quick3way {
    private static <T> void sort(Comparable<T>[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int lt = lo;
        int i = lo + 1;
        int gt = hi;
        Comparable<T> v = a[lo];

        while (i <= gt) {
            int cmp = a[i].compareTo((T) v);
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
