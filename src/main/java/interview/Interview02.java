package interview;

import common.ListNode;

/**
 * 搜狐面试：
 * 快速排序
 * 确定链表中存在环
 */
public class Interview02 {
    public static boolean checkStyle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
