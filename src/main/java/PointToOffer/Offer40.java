package PointToOffer;

import java.util.Arrays;

/**
 * 剑指 Offer 40. 最小的k个数
 */
public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
