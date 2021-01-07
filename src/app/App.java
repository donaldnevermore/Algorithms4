package app;

import sort.Quick;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Comparable[] a = { new Comp(3), new Comp(2), new Comp(1), new Comp(5), new Comp(4) };
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
