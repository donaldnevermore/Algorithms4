package chapter1;

import edu.princeton.cs.algs4.KMP;

public class Questions {
    // 1.1.9
    public String to(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }

        return s;
    }

    // 1.1.11
    public void print2DArray(int[][] arr) {
        System.out.print("  ");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i);
            System.out.print(' ');
            for (int j = 0; j < arr[i].length; j++) {
                // System.out.print(arr[i][j] ? '*' : ' ');
                System.out.print(arr[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    // 1.1.13
    public void transposition(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        var tp = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                tp[i][j] = arr[j][i];
            }
        }

        print2DArray(tp);
    }

    // 1.1.14
    public void lg(int N) {
        if (N == 1) {
            System.out.println(0);
            return;
        }

        int i = 0;
        int num = 1;

        while (i < N / 2) {
            num *= 2;
            if (num < N) {
                i++;
            } else {
                break;
            }
        }

        System.out.println(i);
    }

    // 1.1.15
    public int[] histogram(int[] a, int M) {
        var h = new int[M];

        for (int i : a) {
            h[i]++;
        }

        for (int i : h) {
            System.out.println(i);
        }

        return h;
    }

    // 1.1.20
    public static int ln(int n) {
        if (n == 1) {
            return 1;
        }

        return n * ln(n - 1);
    }

    // 1.1.22
}
