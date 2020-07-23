package interview;

/**
 * 猫眼娱乐：
 * 1、查找数组中元素出现的第一个位置
 * 2、求m的n次方
 */
public class Interview20200723<T> {
    public static int search(int[] array, int target) {
        int low = 0, high = array.length - 1, mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if (array[low] != target) {
            return -1;
        } else {
            return low;
        }
    }

    public static int searchV2(int[] array, int target) {
        int low = 0, high = array.length - 1, mid;
        while (low < high) {
            mid = (low + high + 1) / 2;
            if (array[mid] <= target) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        if (array[low] != target) {
            return -1;
        } else {
            return high;
        }
    }


    /**
     * @param m
     * @param n
     * @return m 的 n 次方
     */
    public static int calculate(int m, int n) {
        if (n == 1) {
            return m;
        }
        int result = calculate(m, n / 2);
        if (n / 2 == 1 && n != 2) {
            return m * result * result;
        } else {
            return result * result;
        }

    }

    public static <T> void swap(T a, T b) {
        T temp = a;
        b = a;
        a = temp;
    }

    public static void main(String[] args) {


    }
}
