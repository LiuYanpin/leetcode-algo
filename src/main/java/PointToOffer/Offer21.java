package PointToOffer;

/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 */
public class Offer21 {
    public static int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (nums[left] % 2 == 1 && left < right) {
                left++;
            }
            while (nums[right] % 2 == 0 && left < right) {
                right--;
            }
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }
        return nums;
    }

}
