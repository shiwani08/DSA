class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int lower = 0, upper = m * n - 1;

        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;

            // map the 1D mid index back to 2D coordinates
            int row = mid / n;
            int col = mid % n;
            int value = matrix[row][col];

            if (target < value) {
                upper = mid - 1;
            } else if (target > value) {
                lower = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}