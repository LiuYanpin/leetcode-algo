package middleAlgo;

import java.util.ArrayList;
import java.util.List;

/**
 * 78.子集
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */
public class Title78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num: nums){
            List<List<Integer>> newList = new ArrayList<>();
            for (List<Integer> existSet : result) {
                List<Integer> list = new ArrayList<>();
                list.addAll(existSet);
                list.add(num);
                newList.add(list);
            }
            result.addAll(newList);
        }
        return result;
    }
}
