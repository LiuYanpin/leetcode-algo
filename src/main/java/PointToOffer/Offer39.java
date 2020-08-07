package PointToOffer;

import java.util.HashMap;

/**
 * 剑指 Offer 39. 数组中出现次数超过一半的数字
 */
public class Offer39 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int key = nums[i];
            counts.computeIfPresent(key, (k, v) -> v + 1);
            counts.putIfAbsent(key, 1);
            if (counts.get(key) > length / 2) {
                return key;
            }
        }
        return -1;
    }

    public static int majorityElement2(int[] nums) {
        int votes = 0, result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (votes == 0) {
                result = nums[i];
            }
            votes += nums[i] == result ? 1 : -1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement2(new int[]{8,8,7,7,7}));
    }
}
