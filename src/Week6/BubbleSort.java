package Week6;

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
}
