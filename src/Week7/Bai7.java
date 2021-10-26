package Week7;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[(n/2)]);
    }
}
