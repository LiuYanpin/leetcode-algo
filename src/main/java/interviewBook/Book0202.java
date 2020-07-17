package interviewBook;

import common.ListNode;

public class Book0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode node = reverse(head);
        while (k > 1) {
            node = node.next;
            k = k - 1;
        }
        return node.val;
    }

    private ListNode reverse(ListNode head) {
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
