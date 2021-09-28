package Week3;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] a, int number) {
        int n = a.length;
        int left = 0, right = n - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(number > a[mid])
                left = mid + 1;
            else if(number < a[mid])
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static int rebinarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return rebinarySearch(arr, l, mid - 1, x);

            return rebinarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            a[i] = (int) randomDouble;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(binarySearch(a, 3));
    }
}
