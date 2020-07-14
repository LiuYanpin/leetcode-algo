package simpleAlgo;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 回文链表
 * 请判断一个链表是否为回文链表。
 */
public class Title234 {
    public static boolean isPalindromeByList(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        List<Integer> array = new ArrayList<>();
        while (head != null) {
            array.add(head.val);
            head = head.next;
        }
        for (int i = 0, j = array.size() - 1; i <= array.size() / 2; i++, j--) {
            if (!array.get(i).equals(array.get(j))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeByDoublePoint(ListNode head) {
        return false;
    }
}
