package uf;

public class WeightedQuickUnionUF extends UF {
    private int[] sz;

    public WeightedQuickUnionUF(int N) {
        super(N);

        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = i;
        }
    }

    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }

        count--;
    }
}
