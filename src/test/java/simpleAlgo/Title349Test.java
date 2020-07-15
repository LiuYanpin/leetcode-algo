package simpleAlgo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Title349Test {
    @Test
    public void test1() {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        assertArrayEquals(new int[]{2}, Title349.intersection(nums1, nums2));
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        assertArrayEquals(new int[]{2, 2}, Title350.intersect(nums1, nums2));
    }
}