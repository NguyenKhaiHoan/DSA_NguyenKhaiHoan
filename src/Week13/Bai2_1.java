package Week13;

import edu.princeton.cs.algs4.*;

import java.util.Scanner;

public class Bai2_1 {
    // Lỗi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        In in = new In(sc);
        EdgeWeightedGraph G = new EdgeWeightedGraph(in);
        LazyPrimMST mst = new LazyPrimMST(G);
        System.out.println((int) mst.weight());
    }
}