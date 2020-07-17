package interviewBook;

import common.ListNode;

import java.util.HashSet;

public class Book0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = head;
        ListNode pre = new ListNode();
        pre.next = head;
        HashSet<Integer> set = new HashSet<>();
        while (head.next != null) {
            if (set.contains(head.val)) {
                pre.next = head.next;
            } else {
                set.add(head.val);
                pre = pre.next;
            }
            head = head.next;
        }
        if (set.contains(head.val)) {
            pre.next = null;
        }
        return sentinel;
    }

}
