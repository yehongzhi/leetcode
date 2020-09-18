class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int y = matrix[0].length - 1;
        int x = 0;
        while (y >= 0 && x < matrix.length) {
            int num = matrix[x][y];
            if (num == target) {
                return true;
            } else if (num < target) {
                x++;
            } else {
                y--;
            }
        }
        return false;
    }
}
