package Week5;

import edu.princeton.cs.algs4.*;

public class SelectionSort {
    public static void selectionsort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Chọn lấy phần tử có giá trị nhỏ nhất trong đoạn từ i đến cuối dãy
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Đổi chỗ số đó với phần tử tại vị trí i
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Xuất mảng
    public static void printArray(int[] arr) {
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        In in = new In("D:\\coursera\\data\\4Kints.txt"); // tạo luồng đọc từ file
        int[] arr = in.readAllInts();  // đọc toàn bộ file vào mảng a
        System.out.println("Mảng 1 ban đầu:");
        printArray(arr);
        long start = System.currentTimeMillis();
        selectionsort(arr);
        long end = System.currentTimeMillis();
        System.out.println("Mảng 1 sau khi sắp xếp:");
        printArray(arr);
        System.out.println("Thời gian chạy: " + (end - start));

        In in2 = new In("C:\\Users\\ADMIN\\Desktop\\4Kints.txt"); // tạo luồng đọc từ file
        int[] arr2 = in2.readAllInts();  // đọc toàn bộ file vào mảng a
        System.out.println("Mảng 2 ban đầu:");
        printArray(arr);
        long start2 = System.currentTimeMillis();
        selectionsort(arr);
        long end2 = System.currentTimeMillis();
        System.out.println("Mảng 2 sau khi sắp xếp:");
        printArray(arr);
        System.out.println("Thời gian chạy: " + (end2 - start2));
    }
}
