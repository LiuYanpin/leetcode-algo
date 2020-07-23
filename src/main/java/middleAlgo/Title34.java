package middleAlgo;

/**
 * 34.在排序数组中查找元素的第一个和最后一个位置
 */
public class Title34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        return new int[]{searchFirstPos(nums, target), searchLastPos(nums, target)};
    }

    private int searchFirstPos(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if (nums[low] != target) {
            return -1;
        } else {
            return low;
        }

    }

    private int searchLastPos(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low < high) {
            mid = (low + high + 1) / 2;
            if (nums[mid] <= target) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        if (nums[low] != target) {
            return -1;
        } else {
            return high;
        }
    }

}
