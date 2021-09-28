package Week3;

import java.util.Arrays;

public class ThreeSumBai7 {
    public static void Sum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int left = i + 1;
            int right = n - 1;
            int x = arr[i];
            while (left < right) {
                if (x + arr[left] + arr[right] == 0) {
                    // In các phần tử nếu tổng bằng 0
                    System.out.println(x + " " + arr[left] + " " + arr[right]);

                    left++;
                    right--;
                }
                // Nếu tổng ba phần tử nhỏ hơn 0 rồi tăng dần sang trái
                else if (x + arr[left] + arr[right] < 0)
                    left++;

                // Nếu tổng lớn hơn 0 thì giảm ở phía bên phải
                else
                    right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 6, -5, 0, -1, -2, 3};
        Sum(a);
    }
}
