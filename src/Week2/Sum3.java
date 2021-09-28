import edu.princeton.cs.algs4.*;

public class Sum3 {
    public static void printSum3(int[] a){
        int n = a.length;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if(a[i] + a[j] + a[k] == 0){
                        System.out.println(a[i] + " " + a[j] + " "+ a[k]);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        In in = new In("D:\\coursera\\data\\1Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();// đọc toàn bộ file vào mảng a
        // xử lý dữ liệu trong mảng a
        printSum3(a);
    }
}
