package interview;

import java.util.HashMap;
import java.util.Stack;

/**
 * 老虎集团面试
 * 判断括号的合理性
 * 且要符合数学原则：大括号包含小括号
 */
public class Interview20200721 {
    public static boolean isValid(String input) {
        if (input.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = input.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        for (char ch: chars) {
            if (!map.containsKey(ch)) {
                stack.push(ch);
            } else if (stack.isEmpty() || map.get(ch) != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
