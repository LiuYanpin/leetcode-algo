package simpleAlgo;

import common.ListNode;
import org.junit.Test;

import static common.Utils.printListNode;

public class Title83Test {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;

        printListNode(Title83.deleteDuplicates(node1));
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        printListNode(Title83.deleteDuplicates(node1));
    }
}