package simpleAlgo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Title88Test {
    @Test
    public void test1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        Title88.merge(nums1, 3, nums2, 3);
        System.out.println(nums1);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }
}