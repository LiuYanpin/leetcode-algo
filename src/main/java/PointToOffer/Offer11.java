package PointToOffer;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 */
public class Offer11 {
    public static int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        if (numbers[0] < numbers[numbers.length - 1]) {
            return numbers[0];
        }
        int start = 0, end = numbers.length - 1, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (numbers[mid] > numbers[end]) {
                start = mid + 1;
            } else if (numbers[mid] <= numbers[end]) {
                end = end - 1;
            } else {
                return numbers[mid];
            }
        }
        return numbers[start];
    }

    public static void main(String[] args) {
//        System.out.println(minArray(new int[]{3, 4, 5, 1, 2}));
//        System.out.println(minArray(new int[]{2, 2, 2, 0, 1}));
        System.out.println(minArray(new int[]{3, 3, 1, 3}));
    }

}
