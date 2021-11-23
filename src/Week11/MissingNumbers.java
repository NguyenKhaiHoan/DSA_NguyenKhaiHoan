package Week11;

import java.util.*;

public class MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        Map<Integer, Integer> myMap = new TreeMap<>();

        // Thêm phần tử vào myMap từ mảng brr
        for (int i : brr) {
            if(!myMap.containsKey(i)) {
                // i chưa xuất hiện trong myMap
                myMap.put(i, 1);
            } else {
                // i đã xuất hiện trong myMap
                int soLanXuatHien = myMap.get(i); // Lấy ra value của key
                soLanXuatHien++;
                myMap.put(i, soLanXuatHien);
            }
        }

        // Xóa phần tử ở mảng mới
        for (int i : arr) {
            int soLanXuatHien = myMap.get(i);
            soLanXuatHien--;
            if (soLanXuatHien == 0)
                myMap.remove(i);
            else
                myMap.put(i, soLanXuatHien);
        }

        // Tạo 1 mảng result.
        int[] result = new int[myMap.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : myMap.entrySet()) {
            result[i++] = integerIntegerEntry.getKey();
        }
        List<Integer> resultList = new ArrayList<Integer>();
        for (int num : result) {
            resultList.add(i);
        }
        return resultList;
    }
}
