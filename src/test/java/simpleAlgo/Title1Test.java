package simpleAlgo;

import org.junit.Test;

import static simpleAlgo.LinklistUtils.printArrays;

public class Title1Test {

    @Test
    public void test1() {
        int[] array = new int[]{2, 7, 11, 15};
        printArrays(Title1.twoSum(array, 9));
    }

    @Test
    public void test2() {
        int[] array = new int[]{2, 3, 4};
        printArrays(Title1.twoSum(array, 6));
    }

    @Test
    public void test3() {
        int[] array = new int[]{1, 3, 3, 4};
        printArrays(Title1.twoSum(array, 6));
    }
}