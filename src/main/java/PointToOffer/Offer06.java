package PointToOffer;

import common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 剑指Offer ：从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] reversePrintV2(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode currNext = curr.next;
            curr.next = pre;
            pre = curr;
            curr = currNext;
        }
        List<Integer> result = new ArrayList<>();
        while (pre != null) {
            result.add(pre.val);
            pre = pre.next;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] reversePrintV3(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        int size = stack.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}