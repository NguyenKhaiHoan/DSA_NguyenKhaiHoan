package Week6;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

public class QuickSort {

    // Hàm nhận phần tử cuối cùng làm chốt
    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {

            // Nếu phần tử hiện tại nhỏ hơn chốt
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] và arr[high] (hoặc pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private static void sort(int arr[], int low, int high) {
        if (low < high) {

            // pi là chỉ mục của chốt, arr[pi] vị trí của chốt
            int pi = partition(arr, low, high);

            // Sắp xếp đệ quy các phần tử
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        In in = new In("D:\\coursera\\data\\Random1000.txt");
        int[] a = in.readAllInts();
        long start = System.currentTimeMillis();
        sort(a, 0, a.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
        StdArrayIO.print(a);
    }
    // (1) 1Kints.txt               AverageTime: (0 + 0 + 0) / 3 = 0
    // (1) 4Kints.txt               AverageTime: (0 + 0 + 0) / 3 = 0
    // (2) Random1000.txt           AverageTime: (0 + 0 + 0 + 0 + 1) / 5 = 0.2
    // (2) Random.txt               AverageTime: (1 + 0 + 1 + 1 + 0) / 5 = 0.6
    // (3) 1KintsIsSorted.txt       AverageTime: (3 + 3 + 4) / 3 = 3.33
    // (4) 1KintsReverseSorted.txt  AverageTime: (3 + 2 + 2) / 3 = 2.33
    // (5) Duplicate.txt            AverageTime: (6 + 5 + 6) / 3 = 5.6
}
