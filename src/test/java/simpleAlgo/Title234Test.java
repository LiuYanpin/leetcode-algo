package simpleAlgo;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Title234Test {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        assertFalse(Title234.isPalindromeByList(node1));
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        assertTrue(Title234.isPalindromeByList(node1));
    }



    @Test
    public void test3() {
        ListNode node1 = new ListNode(1);

        assertTrue(Title234.isPalindromeByList(node1));
    }

    @Test
    public void test4() {
        assertTrue(Title234.isPalindromeByList(null));
    }
}