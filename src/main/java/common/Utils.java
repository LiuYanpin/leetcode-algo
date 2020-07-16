package common;

import java.util.List;

public class Utils {

    public static void printListNode(ListNode head) {
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

    public static void printArrayList(List<Integer> array) {
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
