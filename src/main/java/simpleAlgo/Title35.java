package simpleAlgo;


/**
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 */
public class Title35 {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target < nums[0]) {
            return 0;
        }
        int n = nums.length;
        if (target > nums[n - 1]) {
            return n;
        }
        return binarySearch(nums, target);
    }

    private static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) /2;
            int midVal = nums[mid];
            if (midVal < target) {
                low = mid + 1;
            } else if (midVal > target) {
                high = mid - 1;
            } else if (midVal == target) {
                return mid;
            }
        }
        return low;
    }
}
