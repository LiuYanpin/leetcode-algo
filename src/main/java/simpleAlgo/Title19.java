package simpleAlgo;

import common.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class Title19 {
    public static ListNode removeNthFromEndV1(ListNode head, int n) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count = count + 1;
            temp = temp.next;
        }
        temp = sentinel;
        int step = count - n;
        while (temp != null) {
            if (step == 0) {
                temp.next = temp.next.next;
                return sentinel.next;
            }
            temp = temp.next;
            step--;
        }
        return sentinel.next;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;
        ListNode fast = sentinel;
        ListNode slow = sentinel;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return sentinel.next;
    }
}
