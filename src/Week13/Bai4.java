package Week13;

import edu.princeton.cs.algs4.*;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        In in = new In(sc);
        EdgeWeightedGraph G = new EdgeWeightedGraph(in);
        KruskalMST kmst = new KruskalMST(G);
        System.out.println((int) kmst.weight());
    }
}
