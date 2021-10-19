package Week6;

public class SelectionSort {
    private void selectionSort(int arr[]) {
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
}
