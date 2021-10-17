package Week6;

import java.util.*;

public class InsertionSortPart1 {
    public static void insertIntoSorted(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(temp >= arr[i]){
                arr[i + 1] = temp;
                printArray(arr);
                break;
            }
            arr[i + 1] = arr[i];
            printArray(arr);
        }
        if(temp < arr[0]){
            arr[0] = temp;
            printArray(arr);
        }
    }

    private static void printArray(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        insertIntoSorted(arr);
    }
}
