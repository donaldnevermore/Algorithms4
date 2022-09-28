package sort;

public class Selection {
    public static void sort(Comparable[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (Util.less(a[j], a[min])) {
                    min = j;
                }
            }

            Util.exch(a, i, min);
        }
    }
}
