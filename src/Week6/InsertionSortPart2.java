package Week6;

import java.util.*;

public class InsertionSortPart2 {
    public static void insertionSortPart2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] <= arr[j]) {
                    printArray(arr);
                    break;
                } else {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    if(j == 1) {
                        printArray(arr);
                    }
                }
            }
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
        insertionSortPart2(arr);
    }
}
