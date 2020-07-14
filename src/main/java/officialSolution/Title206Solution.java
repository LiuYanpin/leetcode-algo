package officialSolution;

import common.ListNode;

public class Title206Solution {
    public ListNode reverseListByDoublePoint(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public ListNode reverseListByRecursion(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListByRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
