package simpleAlgo;

import java.util.*;

/**
 * 数组的相对排序
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 */
public class Title1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int key = arr1[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            int key = arr2[i];
            while (map.get(key) > 0) {
                result.add(key);
                map.put(key, map.get(key) - 1);
            }
            map.remove(key);
        }
        result.addAll(other(map));

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static List<Integer> other(HashMap<Integer, Integer> map) {
        List<Integer> list = new ArrayList<>();
        map.forEach((key, value) -> {
            while (value > 0) {
                list.add(key);
                value--;
            }
        });
        list.sort(Comparator.comparingInt(Integer::intValue));
        return list;
    }
}
