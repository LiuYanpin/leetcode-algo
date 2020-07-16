package PointToOffer;

import common.ListNode;

/**
 * 剑指 Offer 22：链表中倒数第k个节点
 * 输入一个链表，输出该链表中倒数第k个节点。
 * 为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 */
public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count = count + 1;
            temp = temp.next;
        }
        temp = head;
        int pos = count - k;
        while (pos > 0) {
            temp = temp.next;
            pos = pos - 1;
        }
        return temp;
    }
}
