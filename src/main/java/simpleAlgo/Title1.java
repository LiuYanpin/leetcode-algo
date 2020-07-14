package simpleAlgo;

import java.util.ArrayList;
import java.util.HashMap;

public class Title1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> source = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (source.containsKey(num)) {
                source.get(num).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                source.put(num, list);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (source.containsKey(diff) && diff != num) {
                return new int[]{i, source.get(diff).get(0)};
            } else if (diff == num && source.get(diff).size() > 1) {
                return new int[]{i, source.get(diff).get(1)};
            }
        }
        return null;
    }
}
