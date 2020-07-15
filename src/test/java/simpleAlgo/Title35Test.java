package simpleAlgo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Title35Test {
    @Test
    public void test1() {
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(2, Title35.searchInsert(nums, 5));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(1, Title35.searchInsert(nums, 2));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(4, Title35.searchInsert(nums, 7));
    }

    @Test
    public void test4() {
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(0, Title35.searchInsert(nums, 0));
    }

    @Test
    public void test6() {
        int[] nums = new int[]{1,3};
        assertEquals(1, Title35.searchInsert(nums, 2));
    }
}