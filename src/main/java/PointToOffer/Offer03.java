package PointToOffer;

import java.util.HashSet;

/**
 * 剑指 Offer 03. 数组中重复的数字
 */
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
}
