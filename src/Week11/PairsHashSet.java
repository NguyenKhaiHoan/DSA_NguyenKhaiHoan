package Week11;

import java.util.*;

public class PairsHashSet {
    public static int pairs(int k, List<Integer> arr) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        // Viết gọn HashSet<Integer> set = new HashSet<>(arr);
        // Xét từng phần tử number tìm xem có phần tử nào - k bằng number không nếu có cộng biến đếm
        for(int number : arr) {
            if(set.contains(number + k)) {
                count++;
            }
        }
        return count;
    }
}
