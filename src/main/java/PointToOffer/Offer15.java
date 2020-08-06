package PointToOffer;

/**
 * 剑指 Offer 15. 二进制中1的个数
 */
public class Offer15 {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }

    public static int hammingWeight3(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }
}
