package Week8;

import java.util.*;

public class Bai2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String temp = "";
        for(int i = A.length() - 1; i >= 0; i--)
            temp += A.charAt(i);
        if(temp.equals(A)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
