package simpleAlgo;

import common.ListNode;

public class Title21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            throw new RuntimeException("Invalid Node");
        }
        ListNode result = new ListNode(0, new ListNode());
        ListNode current = result;

        ListNode sentinel1 = new ListNode(0, l1);
        ListNode sentinel2 = new ListNode(0, l2);
        while (sentinel1.next != null && sentinel2.next != null) {
            if (sentinel1.next.val > sentinel2.next.val) {
                current.next.val = sentinel2.next.val;
                current = current.next;
                sentinel2 = sentinel2.next;
                current.next = new ListNode();
            } else if (sentinel1.next.val == sentinel2.next.val) {
                current.next.val = sentinel1.next.val;
                current = current.next;
                current.next = new ListNode();

                current.next.val = sentinel2.next.val;
                current = current.next;
                current.next = new ListNode();

                sentinel1 = sentinel1.next;
                sentinel2 = sentinel2.next;
            } else {
                current.next.val = sentinel1.next.val;
                current = current.next;
                current.next = new ListNode();

                sentinel1 = sentinel1.next;
            }
        }
        if (sentinel1.next != null) {
            current.next = sentinel1.next;
        } else if (sentinel2.next != null) {
            current.next = sentinel2.next;
        }
        return result.next;
    }
}
