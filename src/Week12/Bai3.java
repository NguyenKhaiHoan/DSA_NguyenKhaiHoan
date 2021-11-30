package Week12;

import java.util.List;

public class Bai3 {
    private static List<List<Integer>> adj;
    private static boolean[] visited;
    private static int count;
    private static long roadsAndLibraries(int x, int y) {
        long cost = 0;
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                count = 0;
                dfs(i);
                if (x > y) {
                    cost += x + (long) y * (count - 1);
                } else {
                    cost += (long) x * count;
                }
            }
        }
        return cost;
    }
    private static void dfs(int i) {
        visited[i] = true;
        count++;
        List<Integer> list = adj.get(i);
        for (int j = 0; j < list.size(); j++) {
            if (!visited[list.get(j)]) {
                dfs(list.get(j));
            }
        }
    }
}
