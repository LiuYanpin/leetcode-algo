package simpleAlgo;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Title1290Test {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        assertEquals(7, Title1290.getDecimalValue(node1));
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        assertEquals(5, Title1290.getDecimalValue(node1));
    }

    @Test
    public void test3() {
        ListNode node1 = new ListNode(0);
        assertEquals(0, Title1290.getDecimalValue(node1));
    }

    @Test
    public void test4() {
        ListNode node1 = new ListNode(1);
        assertEquals(1, Title1290.getDecimalValue(node1));
    }

    @Test
    public void test5() {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        node1.next = node2;
        assertEquals(0, Title1290.getDecimalValue(node1));
    }
}