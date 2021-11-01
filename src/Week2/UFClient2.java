package Week2;// javac -cp D:\coursera\algs4.jar;. UFClient2.java
// java -cp D:\coursera\algs4.jar;. UFClient2 < D:\coursera\data\tinyUF.txt
import edu.princeton.cs.algs4.*;
public class UFClient2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        int index = 1;             // Tạo biến vị trí
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                // Liên thông
                uf.union(p, q);
                // Nếu nằm trong cùng một thành phần liên thông thì thoát cả chương trình
                if(uf.count() == 1) {
                    System.out.println(index);
                    System.exit(0);
                }
            }
            index++;
        }
        // Nếu không thì xuất Failed
        System.out.println("FAILED");
    }
}
