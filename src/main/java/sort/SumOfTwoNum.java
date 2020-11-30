package sort;

import java.util.Arrays;

public class SumOfTwoNum {
    public static int[] methodV1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - value) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }



}
