package Week3;

import java.util.*;

public class SherlockArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(solution(arr));
        }
    }

    public static String solution(int[] arr){
        int sum = 0;
        for (int k : arr) {
            sum += k;
        }
        int t = 0;
        for (int i = 0; i < arr.length; i++){
            if(t == sum - arr[i] - t){
                return "YES";
            }
            t += arr[i];
        }
        return "NO";
    }
}