package Week3;

import java.util.Arrays;

public class ClosestNumber {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            array[i] = (int) randomDouble;
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        String temp = "";
        // Giả sử Min là Interger.MAX_VALUE
        int MIN = Integer.MAX_VALUE;
        int min = 0;
        for(int i = 0; i < n-1; i++)  {
            // Nếu hai số liền kề cùng dấu
            if((array[i] < 0 && array[i + 1] < 0)||(array[i] > 0 && array[i + 1] > 0))
                min = Math.abs(array[i + 1] - array[i]);
            else
                min = Math.abs(array[i + 1]) + Math.abs(array[i]);

            if(min < MIN) {
                MIN = min;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            // Nếu hai số liền kề cùng dấu
            if((array[i] < 0 && array[i + 1] < 0)||(array[i] > 0 && array[i + 1] > 0))
                min = Math.abs(array[i + 1] - array[i]);
            else
                min = Math.abs(array[i + 1]) + Math.abs(array[i]);

            if(min == MIN)
                temp += array[i] + " " + array[i+1] + " ";
        }
        System.out.println(temp);
    }
}
