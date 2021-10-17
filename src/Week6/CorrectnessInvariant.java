package Week6;

import java.util.Scanner;

public class CorrectnessInvariant {
    public static void insertionSort(int n, int[] arr) {
        int i, j;
        int temp;
        for(i = 1; i < n; i++) {
            temp = arr[i];
            j = i-1;
            while(j >= 0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        for(j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(n, arr);
    }
}
