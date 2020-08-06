package PointToOffer;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 */
public class Offer09 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void appendTail(int value) {
        stack1.push(value);
    }
    public int deleteHead() {
        if (stack1.isEmpty()) {
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        Integer result = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }
}
