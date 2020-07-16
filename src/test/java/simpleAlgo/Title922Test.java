package simpleAlgo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Title922Test {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{4, 5, 2, 7}, Title922.sortArrayByParityII(new int[]{4, 2, 5, 7}));
    }
}