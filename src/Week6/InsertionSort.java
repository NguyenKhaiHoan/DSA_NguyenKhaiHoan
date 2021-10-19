package Week6;

import edu.princeton.cs.algs4.*;

public class InsertionSort {
    private static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // Chen a[i] vao day 0 -> i-1
            int ai = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > ai) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;
        }
    }

    public static void main(String[] args) {
        In in = new In("D:\\coursera\\data\\Duplicate.txt");
        int[] a = in.readAllInts();
        long start = System.currentTimeMillis();
        insertionSort(a);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
        StdArrayIO.print(a);
        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
    }
    // (1) 1Kints.txt               AverageTime: (8 + 4 + 4) / 3 = 5.33
    // (1) 4Kints.txt               AverageTime: (20 + 24 + 24) / 3 = 22.67
    // (2) Random.txt               AverageTime: (20 + 24 + 20 + 20 + 24) / 5 = 21.6
    // (2) Random1000.txt           AverageTime: (2 + 2 + 2 + 2 + 2) / 5 = 2
    // (3) 1KintsIsSorted.txt       AverageTime: (0 + 0 + 0) / 3 = 0
    // (4) 1KintsReverseSorted.txt  AverageTime: (8 + 8 + 4) / 3 = 6.67
    // (5) Duplicate.txt            AverageTime: (5 + 4 + 6) / 3 = 5
}