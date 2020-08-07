package PointToOffer;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 */
public class Offer53One {
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0, end = 0;
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if (nums[low] == target) {
            start = low;
        } else {
            return -1;
        }
        low = 0; high = nums.length - 1;
        while (low < high) {
            mid = (low + high + 1) / 2;
            if (nums[mid] <= target) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        if (nums[high] == target) {
            end = high;
        }
        return end - start + 1;
    }

    private static int findFirstPos(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if (nums[low] == target) {
            return low;
        } else {
            return -1;
        }
    }

    private static int findLastPos(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = (low + high + 1) / 2;
            if (nums[mid] <= target) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        if (nums[high] == target) {
            return high;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(findFirstPos(new int[]{5, 7, 7, 8, 8, 8, 10}, 8));
        System.out.println(findLastPos(new int[]{5, 7, 7, 8, 8, 8, 10}, 8));
        System.out.println(search(new int[]{5, 7, 7, 8, 8, 8, 10}, 8));
    }
}
