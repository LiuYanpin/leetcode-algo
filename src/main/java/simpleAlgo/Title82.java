package simpleAlgo;

import common.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 */
public class Title82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = new ListNode();
        sentinel.next = head;
        ListNode pre = sentinel;
        ListNode curr = head;
        ListNode currNext = head.next;
        boolean flag = false;

        while (currNext != null) {
            if (curr.val != currNext.val) {
                pre = curr;
                curr = currNext;
                currNext = currNext.next;
                if (flag) {
                    pre.next = currNext;
                } else {

                }
            } else {
                flag = true;
                curr = currNext;
                currNext = currNext.next;
            }
        }
        return null;
    }

}
