package simpleAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Title350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int key = nums1[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            int key = nums2[i];
            if (map.containsKey(key) && map.get(key) > 0) {
                result.add(key);
                map.put(key, map.get(key) - 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
