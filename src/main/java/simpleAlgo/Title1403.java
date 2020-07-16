package simpleAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 非递增顺序的最小子序列
 */
public class Title1403 {
    public static List<Integer> minSubSequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i : nums) {
            sum = sum + i;
        }
        List<Integer> result = new ArrayList<>();
        int index = nums.length - 1;

        int tempSum = 0;
        while (index >= 0) {
            int num = nums[index];
            tempSum += nums[index];
            if (tempSum <= (sum - tempSum)) {
                result.add(num);
                index--;
            } else {
                result.add(num);
                return result;
            }
        }
        return result;
    }
}
