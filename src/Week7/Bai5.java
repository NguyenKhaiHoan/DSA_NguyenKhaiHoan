package Week7;

import java.util.Scanner;

public class Bai5 {
    public static int partition(int [] ar) {
        int pivotValue = ar[0];
        swap(ar, 0, ar.length - 1);
        int index = 0;
        for (int i = 0; i < ar.length; i++){
            if (ar[i] < pivotValue){
                swap(ar, i, index);
                index++;
            }
        }
        swap(ar, index, ar.length - 1);
        return index;
    }

    private static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    private static void printArray(int[] ar) {
        for (int i: ar) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = scan.nextInt();
        }
        scan.close();
        partition(ar);
        printArray(ar);
    }
}
