package interview;

import common.ListNode;

public class Interview01 {
    public static ListNode plusOne(ListNode n, int m) {
        //先反转
        ListNode node = reverse(n);
        if (node.val + m < 9) {
            node.val = node.val + m;
            return reverse(node);
        } else {
            node.val = (node.val + m) % 10;
        }

        ListNode tail = node;
        while ((node=node.next) != null) {
            if ((node.val + 1) < 9) {
                node.val = node.val + 1;
                return reverse(tail);
            } else {
                node.val = 0;
                if (node.next == null) {
                    node.next = new ListNode(1);
                    return reverse(tail);
                }
            }
        }
        return reverse(tail);
    }

    public static ListNode reverse(ListNode head) {
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
