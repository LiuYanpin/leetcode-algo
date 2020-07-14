package officialSolution;

import common.ListNode;

public class Title234Solution {
    public boolean isPalindromeMethod01(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        ListNode pre = head, prepre = null;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;

            pre.next = prepre;
            prepre = pre;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (pre != null && slow != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode slow = sentinel;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverse(slow.next);
        slow.next = null;
        while (head != null && newHead != null) {
            if (head.val != newHead.val) {
                return false;
            } else {
                head = head.next;
                newHead = newHead.next;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode pre = sentinel;
        ListNode curr = pre.next;
        while (curr.next != null) {
            ListNode nex = curr.next;
            curr.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return pre.next;
    }
}
