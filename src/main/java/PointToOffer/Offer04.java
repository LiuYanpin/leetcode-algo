package PointToOffer;

/**
 * 剑指 Offer 04. 二维数组中的查找
 */
public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int column = matrix[0].length - 1;
        while (row >= 0 && column >= 0 && row < matrix.length) {
            int currentValue = matrix[row][column];
            if (currentValue > target) {
                column--;
            } else if (currentValue < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}
