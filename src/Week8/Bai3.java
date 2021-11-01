package Week8;

import java.util.*;

import static java.lang.System.exit;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, K, count = 0;
        N = scanner.nextInt();
        K = scanner.nextInt();

        Queue<Integer> pqueue = new PriorityQueue(N);
        for (int i = 0; i < N; i++) {
            pqueue.add(scanner.nextInt());
        }
        while (pqueue.size() > 1 && pqueue.peek() < K) {
            if(pqueue.peek() >= K) {
                System.out.println(count);
                exit(0);
            } else {
                int m1 = pqueue.poll();
                int m2 = pqueue.poll();
                pqueue.add(m1 + 2 * m2);
                count++;
            }
        }

        if (pqueue.size() > 1 || pqueue.peek() >= K) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
