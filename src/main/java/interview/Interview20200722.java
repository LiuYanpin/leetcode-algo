package interview;

/**
 * 滴滴面试题：求平方根
 */
public class Interview20200722 {
    public static double sqrt(int input) {
        double num = input * 1.0;
        double start = 1, end = num, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid < num - 10) {
                start = mid + 1;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else if (mid * mid > num - 10 || mid * mid < num + 10) {
                return mid;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(2));
        System.out.println(sqrt(4));
        System.out.println(sqrt(16));
        System.out.println(sqrt(200));
    }
}
