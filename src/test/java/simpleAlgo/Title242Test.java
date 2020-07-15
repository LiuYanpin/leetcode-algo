package simpleAlgo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Title242Test {
    @Test
    public void test1() {
        assertFalse(Title242.isAnagram("a", "aa"));
    }

    @Test
    public void test2() {
        assertTrue(Title242.isAnagram("hello", "olleh"));
    }
}