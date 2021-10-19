package Week6;

import edu.princeton.cs.algs4.*;

public class MergeSort {

    // Merge hai mảng con của arr[].
    // Mảng con thứ nhất là arr[l..m]
    // Mảng con thứ hai là arr[m+1..r]
    private static void merge(int arr[], int l, int m, int r) {

        // Tìm kích thước của 2 mảng con để merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Tạo mảng tạm
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy dữ liệu vào mảng tạm
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge các mảng tạm lại

        // Chỉ mục ban đầu của 2 mảng con
        int i = 0, j = 0;

        // Chỉ mục ban đầu của mảng phụ được hợp nhất
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private static void sort(int arr[], int l, int r) {
        if (l < r) {

            // Tìm điểm chính giữa
            int m = (l + r) / 2;

            // Hàm đệ quy tiếp tục chia đôi
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        In in = new In("D:\\coursera\\data\\Duplicate.txt");
        int[] a = in.readAllInts();
        long start = System.currentTimeMillis();
        sort(a, 0, a.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
        StdArrayIO.print(a);
    }
    // (1) 1Kints.txt               AverageTime: (1 + 0 + 0) / 3 = 0.33
    // (1) 4Kints.txt               AverageTime: (1 + 0 + 0) / 3 = 0.33
    // (2) Random.txt               AverageTime: (0 + 1 + 1 + 1 + 1) / 5 = 0.8
    // (3) 1KintsIsSorted.txt       AverageTime: (0 + 1 + 0) / 3 = 0.33
    // (4) 1KintsReverseSorted.txt  AverageTime: (0 + 0 + 1) / 3 = 0.33
    // (5) Duplicate.txt            AverageTime: (1 + 0 + 0) / 3 = 0.33
}
