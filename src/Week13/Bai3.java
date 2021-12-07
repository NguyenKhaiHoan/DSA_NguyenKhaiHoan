package Week13;

import java.util.*;

public class Bai3 {

    static class Pair implements Comparable<Pair> {
        public int r, v;
        public Pair(int cost, int vertex) {
            r = cost;
            v = vertex;
        }
        @Override
        public int compareTo(Pair c) {
            if (r < c.r) return -1;
            else if (r > c.r) return 1;
            if (v < c.v) return -1;
            else if (v > c.v) return 1;
            return 0;
        }
    }
    
    public static HashMap<Integer, ArrayList<Pair>> adjList;
    public static int[] shortestPaths;

    public static void dijkstra(int s) {
        shortestPaths = new int[adjList.size()];
        for (int i = 0; i < adjList.size(); i++) {
            shortestPaths[i] = Integer.MAX_VALUE;
        }
        shortestPaths[s] = 0;

        HashSet<Integer> visited = new HashSet<>();

        Queue<Pair> queue = new PriorityQueue<>();
        queue.add(new Pair(s, 0));

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int currV = curr.v;
            int currR = curr.r;
            if (!visited.contains(currV)) {
                ArrayList<Pair> adj = adjList.get(currV);
                for (int i = 0; i < adj.size(); i++) {
                    if (currR + adj.get(i).r < shortestPaths[i]) {
                        shortestPaths[i] = currR + adj.get(i).r;
                        if (!visited.contains(adj.get(i).v)) {
                            queue.add(new Pair(shortestPaths[i], adj.get(i).v));
                        }
                    }
                }
                visited.add(currV);
            }
        }
    }
}
