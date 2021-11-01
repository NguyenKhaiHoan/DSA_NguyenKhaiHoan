package Week8;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        Queue maxPQ = new PriorityQueue(N/2 + 1, Collections.reverseOrder());
        Queue minPQ = new PriorityQueue(N/2 + 1);
    }
}
