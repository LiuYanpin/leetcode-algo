package interview;

import common.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 神策科技：打印小于N的斐波那契数列
 */
public class Interview20200719 {
    public static void main(String[] args) {
        Utils.printArrayList(fib(5));
    }

    private static List<Integer> fib(int n) {
        List<Integer> array = new ArrayList<>();
        int a = 1;
        int b = 1;
        while (a < n) {
            array.add(a);
            int temp = a;
            a = b;
            b = b + temp;
        }
        return array;
    }

}
