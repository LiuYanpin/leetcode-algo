package PointToOffer;

import common.ListNode;
import org.junit.Test;

import static common.Utils.printArrays;

public class Offer06Test {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
//        node2.next = node3;
        printArrays(Offer06.reversePrintV3(node1));
    }
}