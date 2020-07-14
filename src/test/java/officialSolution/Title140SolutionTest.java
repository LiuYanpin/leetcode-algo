package officialSolution;

import common.ListNode;
import org.junit.Test;

public class Title140SolutionTest {
    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node3.next = node4;

        System.out.println(Title140Solution.getintersectionNode(node1, node3));
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node3.next = node4;

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node2.next = node4.next = node5;
        node5.next = node6;
        System.out.println(Title140Solution.getintersectionNode(node1, node3).val);

    }
}