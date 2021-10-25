package Week7;

import java.util.Scanner;

public class Bai2 {
    public static int[] countingSort(int[] arr) {
        int[] newArr = new int[100];
        for (int j : arr) {
            newArr[j] = newArr[j] + 1;
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] newArr = countingSort(arr);
        for (int j : newArr) {
            System.out.print(j + " ");
        }
        sc.close();
    }
}
