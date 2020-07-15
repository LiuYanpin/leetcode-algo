package simpleAlgo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Title53Test {

    @Test
    public void test1() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, Title53.maxSubArray(nums));
    }
}