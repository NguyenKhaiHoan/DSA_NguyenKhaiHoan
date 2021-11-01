package Week6;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class BubbleSort {
    private static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* BestCase: Đã được sắp xếp tăng dần
    WorstCase: Đã được sắp xếp giảm dần
    Tốt nhất: n
    Tệ nhất: n^2
    Không gian bộ nhớ sử dụng: O(1)
     */

    public static void main(String[] args) {
        In in = new In("D:\\coursera\\data\\Duplicate.txt");
        int[] a = in.readAllInts();
        long start = System.currentTimeMillis();
        bubbleSort(a);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
        StdArrayIO.print(a);
    }

    // Ngẫu nhiên: 13 15 13
    // Sắp xếp xuôi: 10 10 7
    // Sắp xếp ngược: 9 11 10
    // Toàn giá trị bằng nhau: 11 9 10

}
