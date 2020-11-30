package interview;

/**
 * ebay面试
 * 1、两数交换
 * 2、大数求积
 * 3、最小上升子序列
 */
public class InterviewEbay20200731 {
    public void swap1(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
    }

    public void swap2(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    public void swap3(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public void swap4(int a, int b) {
        b = (a + b) - (a = b);
    }

    public void swap5(int a, int b) {
         a = a - b;
         b = a + b;
         a = b - a;
    }

    public void swap6(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
    }

}
