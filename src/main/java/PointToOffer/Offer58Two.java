package PointToOffer;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 */
public class Offer58Two {
    public String reverseLeftWords(String s, int n) {
        int len = n % s.length();
        return s.substring(len) + s.substring(0, len);
    }
}
