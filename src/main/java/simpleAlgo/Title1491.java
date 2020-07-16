package simpleAlgo;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 去掉最低工资和最高工资后的工资平均值
 * 给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
 * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
 */
public class Title1491 {
    public double average(int[] salary) {
        if (salary == null || salary.length < 2) {
            return 0;
        }
        Arrays.sort(salary);
        double sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return sum / (salary.length - 2);
    }
}
