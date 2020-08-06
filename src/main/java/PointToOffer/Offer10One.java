package PointToOffer;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 */
public class Offer10One {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        int i = 0, temp = 0;
        while (i < n) {
            temp = a;
            a = b;
            b = (temp + b) > 1000000007 ? (temp + b - 1000000007) : (temp + b);
            i++;
        }
        return a % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(fib(48));
    }
}
