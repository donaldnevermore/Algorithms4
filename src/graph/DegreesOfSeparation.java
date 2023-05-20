package graph;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class DegreesOfSeparation {
    public static void run(String[] args) {
        var sg = new SymbolGraph(args[0], args[1]);

        Graph G = sg.G();

        String source = args[2];
        if (!sg.contains(source)) {
            StdOut.println(source + " not in database");
            return;
        }

        int s = sg.index(source);
        var bfs = new BreadthFirstPaths(G, s);

        while (!StdIn.isEmpty()) {
            String sink = StdIn.readLine();
            if (sg.contains(sink)) {
                int t = sg.index(sink);
                if (bfs.hasPathTo(t)) {
                    for (int v : bfs.pathTo(t)) {
                        StdOut.println("  " + sg.name(v));
                    }
                } else {
                    StdOut.println("Not connected");
                }
            } else {
                StdOut.println("Not in database");
            }
        }
    }
}
