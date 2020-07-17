package PointToOffer;

import common.ListNode;
import common.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer52Test {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);

        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(0);
        ListNode node8 = new ListNode(1);

        node1.next = node2;

        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node6.next = node7;
        node7.next = node8;
        node8.next = node3;

        Utils.printListNode(Offer52.getIntersectionNode(node1, node6));;
    }

    @Test
    public void test2() {
        assertTrue(true);
    }

    @Test
    public void test3() {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        Utils.printListNode(Offer52.getIntersectionNode(node1, node4));;
    }

}