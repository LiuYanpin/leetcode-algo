package simpleAlgo;

import java.util.Arrays;

/**
 * 判断能否形成等差数列
 * 给你一个数字数组 arr 。
 * 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
 * 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
 */
public class Title1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr == null || arr.length < 3) {
            return true;
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != diff) {
                return false;
            }
        }
        return true;
    }
}
