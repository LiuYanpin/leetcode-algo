package simpleAlgo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Title1122Test {
    @Test
    public void test1() {
        int[] nums1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] nums2 = new int[]{2,1,4,3,9,6};
        assertArrayEquals(new int[]{2,2,2,1,4,3,3,9,6,7,19}, Title1122.relativeSortArray(nums1, nums2));
    }
}