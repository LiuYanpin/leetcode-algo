package interview;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Interview02Test {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;
        assertTrue(Interview02.checkStyle(node1));
    }
    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        assertFalse(Interview02.checkStyle(node1));
    }

    @Test
    public void test3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        assertTrue(Interview02.checkStyle(node1));
    }

}