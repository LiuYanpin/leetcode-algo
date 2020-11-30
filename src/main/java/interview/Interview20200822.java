package interview;

import common.ListNode;

/**
 * 快手面试：链表的部分反转
 */
public class Interview20200822 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        ListNode pre = null, curr = head;
        while (m > 1) {
            pre = curr;
            curr = curr.next;
            m--;
            n--;
        }
        ListNode con = pre, tail = curr;
        ListNode currNext;
        while (n > 0) {
            currNext = curr.next;
            curr.next = pre;
            pre = curr;
            curr = currNext;
            n--;
        }
        if (con != null) {
            con.next = pre;
        } else {
            head = pre;
        }
        tail.next = curr;
        return head;
    }
}
