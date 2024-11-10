package chap2;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdRandom;
import sort.Insertion;
import sort.Shell;

public class Q2 {
    // 2.1.16
    public static <T extends Comparable<T>> boolean check(T[] arr) {
        var copy = Arrays.copyOf(arr, arr.length);

        Shell.sort(arr);
        Arrays.sort(copy);

        return Arrays.equals(arr, copy);
    }

    // 2.1.17
    public static void animate() {
        int N = 10;
        Double[] a = new Double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform() * 10;
        }

        Insertion.sortAnimated(a);
    }
}
