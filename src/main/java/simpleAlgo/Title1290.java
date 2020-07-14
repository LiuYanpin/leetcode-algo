package simpleAlgo;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Title1290 {
    public static int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int sum = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sum += list.get(i) * Math.pow(2, size - i - 1);
        }
        return sum;
    }

}
