package PointToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 剑指 Offer 57 - II. 和为s的连续正数序列
 */
public class Offer57Two {
    public static int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<>();
        int low = 1, high = 2, sum = 1;
        while (low < high && low < target / 2 + 1) {
            if (sum < target) {
                sum += high++;
            } else if (sum > target) {
                sum -= low++;
            } else {
                int[] temp = new int[high - low];
                int i = 0, j = low;
                while (j < high) {
                    temp[i++] = j++;
                }
                result.add(temp);
                sum -= low++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    private static int[] generateArray(int low, int high) {
        int[] result = new int[high - low];
        int i = 0;
        while (low < high) {
            result[i++] = low++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] ints = findContinuousSequence(15);
        for (int[] a: ints
        ) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static int[][] findContinuousSequence1(int target) {

        List<List<Integer>> listList=new ArrayList<>();
        for(int i=0;i<9;i++){
            listList.addAll(findContinuousSequence(9, i));
        }

        int[][] result=new int[listList.size()][];
        for(int i=0;i<listList.size();i++){
            List<Integer> one=listList.get(i);
            if(one.size()>=2){
                Collections.reverse(one);
                int[] ints = one.stream().mapToInt(x -> x.intValue()).toArray();
                result[i]=ints;
            }
        }
//        int[][]  ints = (int[][]) listList.stream().filter(one->one.size()>=2).map(list -> (int[] )list.stream().mapToInt(y -> y.intValue()).toArray()).toArray();
        return result;
    }

    public static List<List<Integer>> findContinuousSequence(int target, int start) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if(target<start){
            return result;
        } else if(target==start){
            List<Integer> list=new ArrayList<>();
            list.add(start);
            result.add(list);
            return result;
        }else{
            List<List<Integer>> continuousSequence2 = findContinuousSequence(target-start, start + 1);
            for(List<Integer> list:continuousSequence2){
                list.add(start);
                result.add(list);
            }
            return result;
        }
    }
}
