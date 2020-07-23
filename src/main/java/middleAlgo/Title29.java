package middleAlgo;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 */
public class Title29 {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] result = new int[rows * columns];
        int top = 0;
        int left = 0;
        int bottom = rows - 1;
        int right = columns - 1;
        int index = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            for (int i = top + 1; i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i >= left + 1; i--) {
                    result[index++] = matrix[bottom][i];
                }
                for (int i = bottom; i >= top + 1; i--) {
                    result[index++] = matrix[i][left];
                }
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}};
        int[] x = spiralOrder(matrix);
        for (int y: x
             ) {
            System.out.print(y + " ");
        }
    }
}
