package simpleAlgo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Title27Test {
    @Test
    public void test1() {
        int[] nums = new int[]{1};
        assertEquals(0, Title27.removeElement(nums, 1));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1};
        assertEquals(1, Title27.removeElement(nums, 0));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{3, 2, 2, 3};
        assertEquals(2, Title27.removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
//        assertArrayEquals(new int[]{2, 2, 3, 3}, nums);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 1};
        assertEquals(6, Title27.removeElement(nums, 2));
    }

    @Test
    public void test5() {
        int[] nums = new int[]{3, 3};
        assertEquals(0, Title27.removeElement(nums, 3));
//        assertArrayEquals(new int[]{}, nums);
    }

    @Test
    public void test6() {
        int[] nums = new int[]{};
        assertEquals(0, Title27.removeElement(nums, 3));
    }
}