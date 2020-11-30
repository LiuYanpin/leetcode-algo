package PointToOffer;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 */
public class Offer58One {
    public static String reverseWords1(String s) {
        String[] split = s.trim().split("\\s");
        StringBuilder builder = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            String temp = split[i];
            if (temp.equals("")) continue;
            builder.append(temp).append(" ");
        }
        return builder.toString();
    }

    public static String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        s = s.trim();
        int i = s.length() - 1, j = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            builder.append(s, i+1, j+1).append(" ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  Hello   World!  "));
    }

}
