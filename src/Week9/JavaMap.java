package Week9;

import java.util.*;

public class JavaMap {
    public static void main(String []argh)
    {
        Map<String,Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext()) {
            String s = in.nextLine();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
