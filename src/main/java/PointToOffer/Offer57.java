package PointToOffer;

import java.util.HashMap;

/**
 * 剑指 Offer 57. 和为s的两个数字
 */
public class Offer57 {
    public static int[] twoSum1(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.computeIfPresent(num, (k, v) -> v++);
            map.putIfAbsent(num, 1);
        }
        for (int num: nums) {
            if (map.containsKey(target - num)) {
                return new int[]{num, target - num};
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSum2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int diff = target - nums[low];
            while (low < high && nums[high] > diff) {
                high--;
            }
            if (nums[high] == diff) {
                return new int[]{nums[low], nums[high]};
            }
            low++;
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSum3(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int low = 0, high = nums.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                break;
            }
        }

        return null;
    }

    public static int[] twoSum4(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[]{nums[i], nums[j]};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {

    }
}
