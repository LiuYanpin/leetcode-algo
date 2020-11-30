package PointToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 剑指 Offer 17. 打印从1到最大的n位数
 */
public class Offer17 {
    public static int[] printNumbers(int n) {
        double length = Math.pow(10, n);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < length; i++) {
            result.add(i);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(1)));
    }
}
