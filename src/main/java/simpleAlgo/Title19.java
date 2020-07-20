package simpleAlgo;

import common.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class Title19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0 || head == null) {
            return head;
        }
        ListNode reversed = reverse(head);
        if (n == 1) {
            return reverse(reversed.next);
        }

        ListNode sentinel = new ListNode();
        sentinel.next = reversed;

        while (n > 0) {

            n = n - 1;
        }

        return null;
    }

    private static ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode currNext = curr.next;
            curr.next = pre;
            pre = curr;
            curr = currNext;
        }
        return pre;
    }


}
