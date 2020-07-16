package simpleAlgo;

import org.junit.Test;

import static common.Utils.printArrayList;
import static org.junit.Assert.*;

public class Title1403Test {
    @Test
    public void test1() {
        int[] nums = new int[]{4, 3, 10, 9, 8};
        printArrayList(Title1403.minSubSequence(nums));
    }

    @Test
    public void test2() {
        printArrayList(Title1403.minSubSequence(new int[]{4, 4, 7, 6, 7}));
    }

    @Test
    public void test3() {
        printArrayList(Title1403.minSubSequence(new int[]{6}));
    }

}