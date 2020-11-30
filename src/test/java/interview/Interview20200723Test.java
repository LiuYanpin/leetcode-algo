package interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Interview20200723Test {
    @Test
    public void test1() {
        String a = "a";
        String b = "b";
        Interview20200723.swap(a, b);
        assertEquals(a, "a");
        assertEquals(b, "b");
    }

    @Test
    public void test2() {
        StringBuffer a = new StringBuffer("a");
        StringBuffer b = new StringBuffer("b");
        StringBuffer c = a;
        StringBuffer d = b;
        Interview20200723.swap(a, b);
        assertEquals(c, a);
        assertEquals(d, b);
    }

    @Test
    public void test3() {
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<String> c = a;
        List<String> d = b;
        Interview20200723.swap(a, b);
        assertEquals(c, a);
        assertEquals(d, b);
    }

    @Test
    public void test4() {
        int[] arr = new int[]{1, 1, 2, 3, 4};
//        assertEquals(0, Interview20200723.search(arr, 1));
    }

    @Test
    public void test5() {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        assertEquals(2, Interview20200723.search(arr, 2));
    }

    @Test
    public void test6() {
        int[] arr = new int[]{1, 1, 2, 3, 4};
//        assertEquals(0, Interview20200723.searchV2(arr, 1));
    }

    @Test
    public void test7() {
        int[] arr = new int[]{0, 1, 2, 3, 4};
//        assertEquals(2, Interview20200723.searchV2(arr, 2));
    }
}