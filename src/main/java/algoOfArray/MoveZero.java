package algoOfArray;

import java.util.Arrays;

/**
 * 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class MoveZero {
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int indexOfZero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                indexOfZero = i;
                moveArrayFrom(nums, i);
                nums[nums.length - 1] = 0;
            }
        }
    }

    private static void moveArrayFrom(int[] nums, int i) {
        int j = i + 1;
        while (j < nums.length) {
            nums[i] = nums[j];
            i++;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
}
