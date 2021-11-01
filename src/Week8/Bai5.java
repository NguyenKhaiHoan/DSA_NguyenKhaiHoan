package Week8;

import java.util.*;

public class Bai5 {
    public static List<Double> runningMedian(List<Integer> a) {
        List<Double> result = new ArrayList<>();
        Queue<Integer> minPQ = new PriorityQueue<>();
        Queue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());

        result.add(a.get(0) * 1.0);
        maxPQ.add(a.get(0));

        for (int i = 1; i < a.size(); i++) {
            int temp = a.get(i);

            if (maxPQ.size() > minPQ.size()) {
                minPQ.add(temp);
            } else {
                maxPQ.add(temp);
            }

            while(maxPQ.peek() > minPQ.peek()) {
                int biggerNumber = maxPQ.poll();
                int smallerNumber = minPQ.poll();
                maxPQ.add(smallerNumber);
                minPQ.add(biggerNumber);
            }

            if(maxPQ.size() > minPQ.size()) {
                result.add(maxPQ.peek() * 1.0);
            } else {
                result.add((maxPQ.peek() + minPQ.peek()) / 2.0);
            }
        }
        return result;
    }
}
