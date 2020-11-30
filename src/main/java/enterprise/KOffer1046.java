package enterprise;

import java.util.Arrays;

/**
 * 1046. 最后一块石头的重量
 */
public class KOffer1046 {
    public static int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0) {
            return 0;
        }
        int index = stones.length - 1;
        while (index > 0) {
            Arrays.sort(stones, 0, index + 1);
            if (stones[index] != stones[index - 1]) {
                stones[index - 1] = stones[index] - stones[index - 1];
                index--;
            } else {
                stones[index - 1] = 0;
                index -= 2;
            }
        }
        return stones[0];
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
