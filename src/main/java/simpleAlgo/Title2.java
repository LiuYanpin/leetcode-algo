package simpleAlgo;

import common.ListNode;

/**
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class Title2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pos = new ListNode();
        ListNode result = pos;

        boolean carryFlag = false;

        while (l1 != null || l2 != null) {
            l1 = l1 == null ? new ListNode(0) : l1;
            l2 = l2 == null ? new ListNode(0) : l2;

            ListNode newNode = new ListNode();
            int val = l1.val + l2.val + (carryFlag ? 1 : 0);
            newNode.val = val % 10;
            carryFlag = val / 10 == 1;

            pos.next = newNode;
            pos = pos.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (carryFlag) {
            pos.next = new ListNode(1);
        }
        return result.next;
    }
}
