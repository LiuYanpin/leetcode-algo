package simpleAlgo;

import common.ListNode;

public class Title141 {
    public static boolean hasCycle(ListNode head) {
        boolean flag = false;
        if (head == null || head.next == null) {
            return flag;
        }
        ListNode slow = new ListNode(-1);
        ListNode fast = new ListNode(-1);
        slow.next = head;
        fast.next = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                flag = true;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return flag;
    }
}
