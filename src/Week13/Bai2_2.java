package Week13;

import java.util.*;

public class Bai2_2 {

    public static HashMap<Integer, ArrayList<Cost>> adjList;

    static class Cost implements Comparable<Cost> {
        public int r, v;
        public Cost(int cost, int vertex) {
            r = cost;
            v = vertex;
        }
        @Override
        public int compareTo(Cost c) {
            if (r < c.r) return -1;
            else if (r > c.r) return 1;
            if (v < c.v) return -1;
            else if (v > c.v) return 1;
            return 0;
        }
    }
    public static int prim(int start, int numVertices) {
        Queue<Cost> queue = new PriorityQueue<>(numVertices);
        queue.add(new Cost(0, start));

        HashSet<Integer> visited = new HashSet<>();

        int totalCost = 0;
        while (queue.size() > 0) {
            Cost curr = queue.poll();
            int currV = curr.v;
            int currR = curr.r;

            if (visited.contains(currV)) {
                continue;
            }
            visited.add(currV);

            totalCost += currR;
            if (visited.size() == numVertices) {
                return totalCost;
            }

            ArrayList<Cost> adj = adjList.get(currV);
            for (int i = 0; i < adj.size(); i++) {
                queue.add(new Cost(adj.get(i).v, adj.get(i).r));
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVertices = sc.nextInt();
        int numEdges = sc.nextInt();

        adjList = new HashMap<>();
        for (int i = 1; i <= numVertices; i++) {
            adjList.put(i, new ArrayList<Cost>());
        }

        for (int i = 0; i < numEdges; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int c = sc.nextInt();

            adjList.get(n1).add(new Cost(n2, c));
            adjList.get(n2).add(new Cost(n1, c));
        }
        int start = sc.nextInt();
        System.out.println(prim(start, numVertices));
    }
}
