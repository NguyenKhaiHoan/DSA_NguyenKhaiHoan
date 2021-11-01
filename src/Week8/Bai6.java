package Week8;

import java.util.Arrays;
import java.util.List;

public class Bai6 {
    private static String print(String text) {
        String[] words = text.split(" ");
        List<String> listWord = Arrays.asList(words);
        int n = listWord.size();
        boolean[] flag = new boolean[n];
        for (int i = 0; i < n; i++) {
            flag[i] = false;
        }
        String temp = "";
        for (int i = 0; i < n; i++) {
            if (!flag[i]) {
                String word = listWord.get(i);
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (listWord.get(j).equals(listWord.get(i))) {
                        count++;
                        flag[j] = true;
                    }
                }
                temp = temp + (listWord.get(i) + ": " + count + "\n");
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String text = "xin la xin vinh biet cu";
        System.out.println(print(text));
    }
}
