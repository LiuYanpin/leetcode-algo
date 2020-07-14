package simpleAlgo;

import common.ListNode;

/**
 * 删除排序链表中的重复元素
 * 描述：给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */
public class Title83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode pre = head;
        ListNode curr = pre.next;
        while (curr != null) {
            if (pre.val != curr.val) {
                pre = pre.next;
                curr = curr.next;
            } else {
                curr = curr.next;
                pre.next = curr;
            }
        }
        return sentinel.next;
    }
}
