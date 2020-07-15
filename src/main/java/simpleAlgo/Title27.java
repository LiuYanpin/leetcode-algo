package simpleAlgo;

/**
 * 移除元素
 */
public class Title27 {
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            if (val == nums[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        int result = 0;
        for (int i = 0, j = length - 1; i <= j; ) {
            if (nums[i] == val && nums[j] != val) {
                nums[i] = nums[j];
                result = i;
                i++;
                j--;
            } else if (nums[i] == val && nums[j] == val) {
                j--;
            } else {
                result = i;
                i++;
            }
        }
        if (nums[result] == val) {
            return result;
        } else {
            return result + 1;
        }
    }

    public static int removeElementV2(int[] nums, int val) {
        if (nums == null) {
            return -1;
        }
        int length = nums.length;
        for (int left = 0, right = length - 1; left <= right; ) {
            int eright = findNotEqual(nums, right, val);
            int eLeft = findEqual(nums, left, val);
            if (eright == -1) {
                return 0;
            }
            if (eLeft == length) {
                return length;
            }

            if (eLeft < eright) {
                swap(nums, eright, eLeft);
                left = eLeft;
                right = eright;
            } else {
                return eLeft;
            }


        }
        return -1;
    }

    static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    static int findNotEqual(int[] nums, int right, int val) {
        for (int tmp = right; tmp >= 0; tmp--) {
            if (nums[tmp] != val) {
                return tmp;
            }
        }
        return -1;
    }

    static int findEqual(int[] nums, int left, int val) {
        for (int tmp = left; tmp <= nums.length - 1; tmp++) {
            if (nums[tmp] == val) {
                return tmp;
            }
        }
        return nums.length;
    }
}
