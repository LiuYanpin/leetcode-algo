package PointToOffer;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class Offer53 {
    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumberV2(int[] nums) {
        int left = 0, right = nums.length - 1, mid = (left + right) / 2;
        while (left <= right) {
            if (mid < nums[mid]) {
                right = mid + 1;
            } else if (mid == nums[mid]) {
                left = mid;
            }
        }
        return mid + 1;
    }
}
