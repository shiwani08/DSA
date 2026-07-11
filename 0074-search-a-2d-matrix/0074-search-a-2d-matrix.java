class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length, i, j, k = 0, mid, lower, upper;
        int arr[] = new int [m * n];

        // filling into the 1D arr
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[k++] = matrix[i][j];
            }
        }

        // doing binary search on arr
        lower = 0;
        upper = k - 1;

        mid = (lower + upper) / 2;

        while (lower <= upper) {
            mid = (lower + upper) / 2;

            if(target < arr[mid]) 
                upper = mid - 1;

            else if(target > arr[mid])
                lower = mid + 1;

            else {
                return true;
            }
        }

        return false;
    }
}