package interview;

import java.util.*;

/**
 * 探探面试：打印数组的所有子集
 */
public class Interview20200720 {
    public static List<List<Integer>> subCollection(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                List<Integer> list = new ArrayList<>();
                for (Integer num: result.get(j)) {
                    list.add(num);
                }
                list.add(arr[i]);
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(subCollection(ints));
    }
}
