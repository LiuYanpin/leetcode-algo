package simpleAlgo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Title66Test {
    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 4}, Title66.plusOne(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 9};
        assertArrayEquals(new int[]{2, 0}, Title66.plusOne(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{9, 9};
        assertArrayEquals(new int[]{1, 0, 0}, Title66.plusOne(nums));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{2, 4, 9, 4, 0}, Title66.plusOne(new int[]{2, 4, 9, 3, 9}));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{1, 0}, Title66.plusOne(new int[]{9}));
    }
}