package PointToOffer;

import common.ListNode;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 */
public class Offer52 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode first = headA;
        ListNode second = headB;
        while (true) {
            if (first != second) {
                if (first.next == null && second.next == null) {
                    return null;
                }
                first = (first.next == null) ? headB : first.next;
                second = (second.next == null) ? headA : second.next;
            } else {
                return first;
            }
        }
    }
}
