package sort;

public class Insertion {
    public static void sort(Comparable[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && Util.less(a[j], a[j - 1]); j--) {
                Util.exch(a, j, j - 1);
            }
        }
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i < hi; i++) {
            for (int j = i; j > 0 && Util.less(a[j], a[j - 1]); j--) {
                Util.exch(a, j, j - 1);
            }
        }
    }

    public static void sort(Comparable[] a, int lo, int hi, int d) {
        for (int i = lo + 1; i < hi; i++) {
            for (int j = i; j > 0 && Util.less(a[j], a[j - 1]); j--) {
                Util.exch(a, j, j - 1);
            }
        }
    }
}
