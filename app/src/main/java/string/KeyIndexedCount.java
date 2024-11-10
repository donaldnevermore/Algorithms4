package string;

interface Str {
    int key();
}

public class KeyIndexedCount {
    public void sort(Str[] a) {
        int R = 256;
        int N = a.length;

        Str[] aux = new Str[N];
        int[] count = new int[R + 1];

        for (int i = 0; i < N; i++) {
            count[a[i].key() + 1]++;
        }

        for (int r = 0; r < R; r++) {
            count[r + 1] += count[r];
        }

        for (int i = 0; i < N; i++) {
            aux[count[a[i].key()]++] = a[i];
        }

        for (int i = 0; i < N; i++) {
            a[i] = aux[i];
        }
    }
}
