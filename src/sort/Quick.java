package sort;

import edu.princeton.cs.algs4.StdRandom;
import static sort.Util.exch;
import static sort.Util.less;

public class Quick {
    private static final int M = 15;

    public static <T extends Comparable<T>> void sort(T[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        // Replace the statements above.
        // Fallback to insertion sort when the array is small to improve performance.
        // if (hi <= lo + M) {
        // Insertion.sort(a, lo, hi);
        // return;
        // }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static <T extends Comparable<T>> int partition(T[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        T v = a[lo];

        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }

            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }
}
