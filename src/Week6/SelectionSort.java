package Week6;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

public class SelectionSort {
    private static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int minidex = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minidex])
                    minidex = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[minidex];
            arr[minidex] = arr[i];
            arr[i] = temp;
        }

        /* Ko có BestCase và WorstCase
        Tốt nhất: n^2
-       Xấu nhất: n^2
        Không gian bộ nhớ sử dụng: O(1)
         */
    }

    public static void main(String[] args) {
        In in = new In("D:\\coursera\\data\\Duplicate.txt");
        int[] a = in.readAllInts();
        long start = System.currentTimeMillis();
        selectionSort(a);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
        StdArrayIO.print(a);
    }

    // Ngẫu nhiên: 13 15 13
    // Sắp xếp xuôi: 10 10 7
    // Sắp xếp ngược: 9 11 10
    // Toàn giá trị bằng nhau: 11 9 10
}
