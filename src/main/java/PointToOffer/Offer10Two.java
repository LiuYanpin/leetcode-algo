package PointToOffer;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 */
public class Offer10Two {
    public static int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int a = 1, b = 2, temp = 0, index = 1;
            while (index < n) {
                temp = (a + b) % 1000000007;
                a = b;
                b = temp;
                index++;
            }
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(numWays(44));
    }
}
