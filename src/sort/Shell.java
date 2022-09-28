package sort;

public class Shell {
    public static void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && Util.less(a[j], a[j - h]); j -= h) {
                    Util.exch(a, j, j - h);
                }
            }

            h = h / 3;
        }
    }
}
