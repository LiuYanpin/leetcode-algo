package simpleAlgo;

public class Title922 {
    public static int[] sortArrayByParityII(int[] A) {
        int oddIndex = A.length - 1;
        int evenIndex = A.length - 2;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0 && A[i] % 2 == 1) {
                oddIndex = searchEvenFromRight(A, oddIndex);
                swap(A, i, oddIndex);
            } else if (i % 2 == 1 && A[i] % 2 == 0) {
                evenIndex = searchOddFromRight(A, evenIndex);
                swap(A, i, evenIndex);
            }
        }
        return A;
    }

    private static int searchOddFromRight(int[] arr, int rightIndex) {
        while (rightIndex > 0) {
            if (arr[rightIndex] % 2 == 1) {
                return rightIndex;
            } else {
                rightIndex -= 2;
            }
        }
        return rightIndex;
    }

    private static int searchEvenFromRight(int[] arr, int rightIndex) {
        while (rightIndex > 0) {
            if (arr[rightIndex] % 2 == 0) {
                return rightIndex;
            } else {
                rightIndex -= 2;
            }
        }
        return rightIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
