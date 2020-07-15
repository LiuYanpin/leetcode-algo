package simpleAlgo;

import java.util.ArrayList;

/**
 * 66.加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Title66 {
    public static int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        if (digits[lastIndex] != 9) {
            digits[lastIndex] = digits[lastIndex] + 1;
            return digits;
        }
        int i = lastIndex;
        for (; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                break;
            }
        }
        if (i > 0) {
            digits[i] = digits[i] + 1;
            return digits;
        } else if (i == 0 && digits[0] != 0) {
            digits[0] = digits[0] + 1;
            return digits;
        } else {
            ArrayList<Integer> newArray = new ArrayList<>(digits.length);
            newArray.add(1);
            for (int j = 0; j < digits.length; j++) {
                newArray.add(0);
            }
            return newArray.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
