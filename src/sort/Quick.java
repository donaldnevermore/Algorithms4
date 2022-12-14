package sort;

import edu.princeton.cs.algs4.StdRandom;
import sort.Insertion;

public class Quick {
    private static final int M = 15;

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        // Fallback to insertion sort when the array is small to improve performance.
        if (hi <= lo + M) {
            Insertion.sort(a, lo, hi);
            return;
        }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];

        while (true) {
            while (Util.less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }

            while (Util.less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }

            Util.exch(a, i, j);
        }

        Util.exch(a, lo, j);

        return j;
    }
}
