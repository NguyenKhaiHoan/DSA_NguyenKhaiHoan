package Week7;

import java.util.List;

public class Bai1 {
    public static int introTutorial(int V, List<Integer> arr) {
        int n = arr.size();
        int left = 0, right = n - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(V > arr.get(mid))
                left = mid + 1;
            else if(V < arr.get(mid))
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
