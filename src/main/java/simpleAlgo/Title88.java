package simpleAlgo;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 */
public class Title88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            insertIntoFirst(nums1, nums2[i], m);
            m++;
        }
    }

    private static void insertIntoFirst(int[] arr,
                                        int insertNum,
                                        int m) {
        int index = m - 1;
        while (index >= 0) {
            if (arr[index] > insertNum) {
                arr[index + 1] = arr[index];
                index--;
            } else {
                arr[index+1] = insertNum;
                return;
            }
        }
        arr[0] = insertNum;
    }
}
