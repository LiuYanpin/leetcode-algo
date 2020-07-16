package PointToOffer;

import common.ListNode;

/**
 * 剑指 Offer 18：删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 */
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode sentinel = new ListNode();
        sentinel.next = head;
        while (sentinel.next != null) {
            if (sentinel.next.val == val) {
                sentinel.next = sentinel.next.next;
                return head;
            }
            sentinel = sentinel.next;
        }
        return head;
    }
}
