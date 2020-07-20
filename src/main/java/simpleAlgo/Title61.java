package simpleAlgo;

import common.ListNode;

/**
 * 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 */
public class Title61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int length = 0;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        temp.next = head;
        length++;
        int pos = length - k % length;
        temp = head;

        while (pos > 1) {
            temp = temp.next;
            pos--;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
