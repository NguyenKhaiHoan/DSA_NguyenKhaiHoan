package Week12;

import edu.princeton.cs.algs4.*;
import java.util.Stack;

public class Bai2_1 {
    public static void main(String[] args) {
        In in = new In();
        int q = in.readInt();
        for (int i = 0; i < q; i++) {
            Graph G = new Graph(in);
            int s = in.readInt();
            BreadthFirstPaths bfp = new BreadthFirstPaths(G, s);
            for (int v = 1; v <= G.V(); v++) {
                if (s != v) {
                    if (bfp.hasPathTo(v)) {
                        Stack<Integer> st = (Stack<Integer>) bfp.pathTo(v);
                        int sum = 0;
                        for (int x = 1; x < st.size(); x++) {
                            sum += 6;
                        }
                        System.out.print(sum + " ");
                    } else {
                        System.out.print(-1 + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}