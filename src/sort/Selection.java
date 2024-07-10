package sort;

import static sort.Util.exch;
import static sort.Util.less;

public class Selection {
    public static <T extends Comparable<T>> void sort(T[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            int min = i;

            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }

            exch(a, i, min);
        }
    }
}
