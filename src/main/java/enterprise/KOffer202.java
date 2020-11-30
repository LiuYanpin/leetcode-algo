package enterprise;

import java.util.HashSet;

/**
 * 202. 快乐数
 */
public class KOffer202 {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = calculateSum(n);
        while (sum != 1 && set.add(sum)) {
            sum = calculateSum(sum);
        }
        return sum == 1;
    }

    private static int calculateSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
