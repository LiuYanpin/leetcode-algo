package PointToOffer;

/**
 * 剑指 Offer 05. 替换空格
 */
public class Offer05 {
    public static String replaceString(String s) {
        char[] chars = s.toCharArray();
        char[] newArray = new char[s.length() * 3];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == ' ') {
                newArray[index++] = '%';
                newArray[index++] = '2';
                newArray[index++] = '0';
            } else {
                newArray[index++] = chars[i];
            }
        }
        return new String(newArray, 0, index);
    }

    public static void main(String[] args) {
        System.out.println(replaceString("hello world"));
    }
}
