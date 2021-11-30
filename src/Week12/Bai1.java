package Week12;

import java.util.Scanner;

public class Bai1 {
    static boolean[][] isVisited = new boolean[300][300];
    static int rows, columns, oldMax = 0;

    public static void DFS(int[][] grid, int i, int j, int curMax){
        // Điều kiện dừng
        if (!(i >= 0 && j >= 0 && i < rows && j < columns))
            return;
        if (grid[i][j] == 0 || isVisited[i][j])
            return;
        // Đánh dấu đã duyệt
        isVisited[i][j] = true;
        // Tăng max hiện tại lên 1
        curMax++;
        // So sánh max cũ và max hiện tại
        if (curMax > oldMax) {
            oldMax = curMax;
        }
        // Đệ quy
        DFS(grid, i, j + 1, curMax);
        DFS(grid, i, j - 1, curMax);
        DFS(grid, i - 1, j, curMax);
        DFS(grid, i + 1, j, curMax);
        DFS(grid, i + 1, j + 1, curMax);
        DFS(grid, i + 1, j - 1, curMax);
        DFS(grid, i - 1, j + 1, curMax);
        DFS(grid, i - 1, j - 1, curMax);
    }
    public static int maxRegion(int[][] grid) {
        rows = grid.length;
        columns = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(grid[i][j] == 1 && !isVisited[i][j]) {
                    DFS(grid, i, j, 0);
                }
            }
        }
        return oldMax;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        columns = scan.nextInt();
        int[][] grid = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = scan.nextInt();
            }
        }
        scan.close();
        System.out.println(maxRegion(grid));
    }
}

