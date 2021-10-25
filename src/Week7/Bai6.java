package Week7;

import java.util.Scanner;

public class Bai6 {
    public static int partition(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low;
        for(int j = low; j < high; j++) {
            if(A[j] <= pivot) {
                int t = A[j];
                A[j] = A[i];
                A[i] = t;
                i++;
            }
        }
        int temp = A[i];
        A[i] = A[high];
        A[high] = temp;
        return i;
    }

    public static void quickSort(int[] A, int low, int high)  {
        if(low < high) {
            int p = partition(A, low, high);
            printArray(A);
            quickSort(A, 0 , p - 1);
            quickSort(A, p + 1, high);
        }
    }

    public static void printArray(int[] A) {
        for(int num : A) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        quickSort(A, 0, A.length-1);
    }
}
