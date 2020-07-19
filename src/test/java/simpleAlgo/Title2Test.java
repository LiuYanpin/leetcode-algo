package simpleAlgo;

import common.ListNode;
import common.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Title2Test {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node3.next = node4;

        ListNode listNode = Title2.addTwoNumbers(node1, node3);
        Utils.printListNode(listNode);// 4 6
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        node4.next = node5;

        ListNode listNode = Title2.addTwoNumbers(node1, node4);
        Utils.printListNode(listNode);// 4  6 3
    }

    @Test
    public void test3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(7);
        node4.next = node5;
        node5.next = node6;

        ListNode listNode = Title2.addTwoNumbers(node1, node4);
        Utils.printListNode(listNode);// 2 5 0 1
    }

    @Test
    public void test4() {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        ListNode listNode = Title2.addTwoNumbers(node1, node4);
        Utils.printListNode(listNode);// 7 0 8
    }

    @Test
    public void test5() {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(5);

        ListNode listNode = Title2.addTwoNumbers(node1, node2);
        Utils.printListNode(listNode);// 0 1
    }
}