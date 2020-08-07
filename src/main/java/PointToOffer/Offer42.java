package PointToOffer;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 */
public class Offer42 {
    public int masSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}
