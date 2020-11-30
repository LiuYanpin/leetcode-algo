package enterprise;

import common.Utils;

public class KOffer10_01 {
    public static void merge(int[] A, int m, int[] B, int n) {
        for (int b: B) {
            int aIndex = m - 1;
            if (A[aIndex] > b) {
                while (aIndex >= 0 && A[aIndex] > b) {
                    A[aIndex + 1] = A[aIndex];
                    aIndex--;
                }
            }
            A[aIndex + 1] = b;
            m++;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 0, 0};
        merge(a, 3, new int[]{0, 5, 6}, 3);
        Utils.printArrays(a);
    }
}
