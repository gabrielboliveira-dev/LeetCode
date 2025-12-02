package Java;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = (rows * cols) - 1;

        while (left <= right) {
            int midIndex = left + (right - left) / 2;
            int midValue = matrix[midIndex / cols][midIndex % cols];

            if (midValue == target) {
                return true;
            }

            if (midValue > target) {
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }

        return false;
    }
}
