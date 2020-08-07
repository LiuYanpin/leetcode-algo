package PointToOffer;

import java.util.Stack;

/**
 * 剑指 Offer 30. 包含min函数的栈
 */
public class Offer30 {
    private Stack<Integer> minValues = new Stack<>();
    private Stack<Integer> values = new Stack<>();

    public void push(int x) {
        if (minValues.isEmpty() || x < minValues.peek()) {
            minValues.push(x);
        } else {
            minValues.push(minValues.peek());
        }
        values.push(x);
    }


    public void pop() {
        values.pop();
        minValues.pop();
    }


    public int top() {
        return values.peek();
    }

    public int min() {
        return minValues.peek();
    }

    public static void main(String[] args) {
        Offer30 stack = new Offer30();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        stack.min();
        stack.pop();
        stack.top();
        stack.min();
    }
}
