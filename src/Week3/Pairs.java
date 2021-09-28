package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int count = 0;
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(Math.abs(array[i] -array[j])== target) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}