package simpleAlgo;

import common.ListNode;
import org.junit.Test;

import static common.Utils.printListNode;

public class Title21Test {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        printListNode(Title21.mergeTwoLists(node1, node2));
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node2.next = node3;
        node3.next = node4;
        printListNode(Title21.mergeTwoLists(node1, node2));
    }

    @Test
    public void test3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;

        ListNode listNode = Title21.mergeTwoLists(node1, node4);
        printListNode(listNode);
    }

    @Test
    public void test4() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node3.next = node4;
        printListNode(Title21.mergeTwoLists(node3, node1));
    }

    @Test
    public void test5() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        printListNode(Title21.mergeTwoLists(node1, null));
    }
}