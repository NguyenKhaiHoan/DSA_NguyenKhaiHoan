package Week9;

import java.util.*;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] left  = new String[n];
        String[] right = new String[n];
        for (int i = 0; i < n; i++) {
            left[i] = sc.next();
            right[i] = sc.next();
        }
        sc.close();
        HashSet<String> hashset = new HashSet(n);
        for (int i = 0; i < n; i++) {
            hashset.add(left[i] + " " + right[i]);
            System.out.println(hashset.size());
        }
    }
}