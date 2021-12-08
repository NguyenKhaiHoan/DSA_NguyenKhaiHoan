package Week13;

import java.util.*;

public class UndirectedGraph {
    static class Edge {
        private int v;
        private int w;
        private double weight;
        public Edge(int v, int w, double weight) {
            this.v = v;
            this.w = w;
            this.weight = weight;
        }
        public double weight() {
            return weight;
        }
        public int either() {
            return v;
        }
        public int other(int vertex) {
            if (vertex == v) return w;
            return v;

        }
        public int compareTo(Edge that) {
            if (this.weight() < that.weight()) return -1;
            else if (this.weight() > that.weight()) return +1;
            return 0;
        }
    }

    private int V;
    private int E;

    public static List<Edge> listEdge;
    public static List<Integer> emptyVertices = new ArrayList<>();

    public UndirectedGraph(int V) {
        this.V = V;
        this.E = 0;
        listEdge = new ArrayList<>();
    }

    public UndirectedGraph(Scanner sc) {
        this(sc.nextInt());
        int E = sc.nextInt();
        for (int i = 0; i < E; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            int weight = sc.nextInt();
            addEdge(v, w, weight);
        }
        V = getSumVer();
    }

    public void addEdge(int v, int w, int weight) {
        if (!emptyVertices.isEmpty()
                && (emptyVertices.contains(v) || emptyVertices.contains(w))) {
            if (emptyVertices.contains(v)) emptyVertices.remove(v);
            else emptyVertices.remove(w);
        }
        listEdge.add(new Edge(v, w, weight));
        E++;
    }

    public void removeEdge(int v, int w) {
        for (int i = 0; i < E; i++) {
            Edge edge = listEdge.get(i);
            if ((edge.v == v && edge.w == w)
                    || (edge.v == w && edge.w == v)) {
                listEdge.remove(edge);
                E--;
                break;
            }
        }
    }

    public void addVertices(int v) {
        emptyVertices.add(v);
    }

    public void removeVertices(int v) {
        if (emptyVertices.contains(v)) {
            emptyVertices.remove(v);
        } else {
            for (int i = 0; i < E; i++) {
                Edge edge = listEdge.get(i);
                if (edge.v == v || edge.w == v) {
                    listEdge.remove(edge);
                    E--;
                    i--;
                }
            }
        }
    }

    private boolean[] marked;

    public void DepthFirstSearch(int v) {
        marked = new boolean[V + 1];
        dfs(v);
    }

    public void dfs(int v) {
        Stack<Integer> stackDFS = new Stack<>();
        stackDFS.push(v);
        int currentVertex;

        while (!stackDFS.isEmpty()) {
            currentVertex = stackDFS.pop();
            if (marked[currentVertex]) continue;

            marked[currentVertex] = true;
            for (int i = 0; i < getAdjVer(currentVertex).length; i++) {
                if (!marked[i]) {
                    stackDFS.push(i);
                }
            }
        }
    }

    public void BreathFirstSearch(int v) {
        marked = new boolean[V];
        bfs(v);
    }

    public void bfs(int v) {
        Queue<Integer> queueBFS = new LinkedList<>();
        queueBFS.add(v);
        int currentVertex;

        while (!queueBFS.isEmpty()) {
            currentVertex = queueBFS.poll();
            if (marked[currentVertex]) continue;

            marked[currentVertex] = true;
            for (int i = 0; i < getAdjVer(currentVertex).length; i++) {
                if (!marked[i]) {
                    queueBFS.add(i);
                }
            }
        }
    }

    public int getSumVer() {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            if (i == 0) {
                temp.add(listEdge.get(i).v);
                temp.add(listEdge.get(i).w);
            }
            Edge edge = listEdge.get(i);
            int v = edge.v;
            int w = edge.w;
            if (!temp.contains(v)) {
                temp.add(v);
            }
            if (!temp.contains(w)) {
                temp.add(w);
            }
        }
        return temp.size() + emptyVertices.size();
    }
    public boolean hasConnect(int v, int w) {
        marked = new boolean[V + 1];
        Stack<Integer> stackDFS = new Stack<>();
        stackDFS.push(v);
        int currentVertex;

        while (!stackDFS.isEmpty()) {
            currentVertex = stackDFS.pop();
            if (marked[currentVertex]) continue;

            marked[currentVertex] = true;
            for (Integer i : getAdjVer(currentVertex)) {
                if (!marked[i]) {
                    stackDFS.push(i);
                    if (i == w) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int[] getAdjVer(int v) {
        ArrayList<Integer> adj = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            Edge e = listEdge.get(i);
            if (e.v == v || e.w == v) {
                if (e.v == v) adj.add(e.w);
                else adj.add(e.v);
            }
        }
        int[] a = new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            a[i] = adj.get(i);
        }
        return a;
    }

    @Override
    public String toString() {
        String s = "Danh sach canh:\n";
        for (int i = 0; i < E; i++) {
            Edge e = listEdge.get(i);
            s += e.v + "-" + e.w + ": " + e.weight + "\n";
        }
        for (int i = 0; i < emptyVertices.size(); i++) {
            s += emptyVertices.get(i) + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UndirectedGraph graph = new UndirectedGraph(sc);
        // In đồ thị ban đầu
        System.out.print(graph.toString());
        graph.getSumVer();
        // Xóa 1 cạnh
        graph.removeEdge(4, 5);
        System.out.print(graph.toString());
        // Lấy các đỉnh kề với 1
        int[] adj = graph.getAdjVer(2);
        System.out.println("Dinh ke voi 1: " + Arrays.toString(adj));
        // Thêm 1 đỉnh:
        graph.addVertices(6);
        System.out.print(graph.toString());
        // Xóa 1 đỉnh
        graph.removeVertices(2);
        System.out.print(graph.toString());
        // Kiểm tra nối
        System.out.println(graph.hasConnect(3, 7));
    }
}