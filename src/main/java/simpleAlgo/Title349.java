package simpleAlgo;

import java.util.HashSet;

public class Title349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>(nums1.length);
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            map.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
