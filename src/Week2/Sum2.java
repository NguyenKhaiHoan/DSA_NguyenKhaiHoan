import edu.princeton.cs.algs4.*;

public class Sum2 {
    public static void printSum2(int[] a){
        int n = a.length;
        for(int i = 0 ; i < n - 1; i++){
            for(int j = i + 1 ; j < n; j++){
                if(a[i] + a[j] == 0){
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        In in = new In(args[0]); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        // xử lý dữ liệu trong mảng a
        printSum2(a);
    }
}