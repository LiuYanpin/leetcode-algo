package simpleAlgo;

import common.ListNode;

public class LinklistUtils {

    public static void printElement(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


    public static void printArrays(int[] arrays) {
        for (int i : arrays) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
