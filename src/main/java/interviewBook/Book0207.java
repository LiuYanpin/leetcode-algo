package interviewBook;

import common.ListNode;

public class Book0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (true) {
            if (p == null && q == null) {
                return null;
            }
            if (p == q) {
                return p;
            }
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
    }
}
