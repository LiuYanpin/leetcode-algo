package simpleAlgo;

import common.ListNode;
import org.junit.Test;

import static common.Utils.printListNode;
import static org.junit.Assert.*;

public class Title21Test {

    @Test
    public void test1() {
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
}