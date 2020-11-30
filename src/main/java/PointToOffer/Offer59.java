package PointToOffer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 59 - I. 滑动窗口的最大值
 */
public class Offer59 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            queue.offer(nums[i]);
        }
        result.add(maxInQueue(queue));
        for (int i = k; i < nums.length; i++) {
            queue.offer(nums[i]);
            queue.poll();
            result.add(maxInQueue(queue));
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int maxInQueue(Queue<Integer> queue) {
        int[] max = new int[]{queue.peek()};
        queue.forEach(v -> {
            if (v > max[0]) max[0] = v;
        });
        return max[0];
    }



    public static void main(String[] args) {
        maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
    }
}
