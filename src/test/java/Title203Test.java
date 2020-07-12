import org.junit.Test;

import static org.junit.Assert.*;

public class Title203Test {
    @Test
    public void should_remove_given_element() {
        Title203.ListNode node1 = new Title203.ListNode(1);
        Title203.ListNode node2 = new Title203.ListNode(2);
        Title203.ListNode node3 = new Title203.ListNode(6);
        Title203.ListNode node4 = new Title203.ListNode(3);
        Title203.ListNode node5 = new Title203.ListNode(4);
        Title203.ListNode node6 = new Title203.ListNode(5);
        Title203.ListNode node7 = new Title203.ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        Title203.printElement(Title203.removeElements(node1, 6));
    }
}