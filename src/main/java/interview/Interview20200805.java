package interview;


/**
 * 滴滴面试：两数之积
 */
public class Interview20200805 {
    public static String multiply(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int resultLength = s1.length() + s2.length();
        int[] result = new int[resultLength];
        for (int i = s1.length() - 1; i >= 0; i--) {
            int num1 = Character.getNumericValue(ch1[i]);
            for (int j = s2.length() - 1; j >= 0; j--) {
                int num2 = Character.getNumericValue(ch2[j]);
                result[i + j + 1] = num1 * num2 + result[i + j + 1];
            }
        }
        StringBuilder s = new StringBuilder();
        int index = resultLength - 1;
        while (index > 0) {
            int value = result[index];
            s.insert(0, value % 10);
            result[index - 1] = result[index - 1] + value / 10;
            index--;
        }
        if (result[0] != 0) {
            s.insert(0, result[0]);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("33", "9339"));
    }
}
