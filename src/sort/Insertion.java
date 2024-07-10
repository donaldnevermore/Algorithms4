package sort;

import edu.princeton.cs.algs4.StdDraw;
import static sort.Util.exch;
import static sort.Util.less;

public class Insertion {
    // The standard one.
    public static <T extends Comparable<T>> void sort(T[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    // The animated one.
    public static <T extends Comparable<T>> void sortAnimated(T[] a) {
        int N = a.length;

        draw(a);
        StdDraw.pause(100);
        StdDraw.clear();
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
                draw(a);
                StdDraw.pause(100);
                StdDraw.clear();
            }
        }
        draw(a);
    }

    private static <T extends Comparable<T>> void draw(T[] a) {
        int N = a.length;
        StdDraw.setXscale(-1, N + 1);
        StdDraw.setYscale(-1, 11);

        for (int i = 0; i < N; i++) {
            double x = 9.0 * i / N;
            double y = (double) a[i] / 2.0;
            double rw = 4.0 / N;
            double rh = (double) a[i] / 2.0;
            // if x = 9.0 * i / N and rw = 4.0 / N, there's no gap.
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    public static <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void sort(String[] a, int lo, int hi, int d) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && strless(a[j], a[j - 1], d); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    private static boolean strless(String v, String w, int d) {
        return v.substring(d).compareTo(w.substring(d)) < 0;
    }
}
