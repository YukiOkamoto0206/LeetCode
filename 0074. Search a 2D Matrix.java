class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0;
        int right = row*column-1;

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            int mid = matrix[midpoint/column][midpoint%column];
            if (mid < target) {
                left = midpoint + 1;
            } else if (target < mid) {
                right = midpoint - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
