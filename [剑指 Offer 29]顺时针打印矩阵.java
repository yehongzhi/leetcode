class Solution {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] res = new int[matrix.length * matrix[0].length];
        int l = 0;//左边
        int r = matrix[0].length - 1;//右边
        int t = 0;//上边
        int b = matrix.length - 1;//下边
        int index = 0;
        while (true) {
            //从左到右
            for (int i = l; i <= r; i++) {
                res[index++] = matrix[t][i];
            }
            if (++t > b) {
                break;
            }
            //从上到下
            for (int i = t; i <= b; i++) {
                res[index++] = matrix[i][r];
            }
            if (--r < l) {
                break;
            }
            //从右到左
            for (int i = r; i >= l; i--) {
                res[index++] = matrix[b][i];
            }
            if (--b < t) {
                break;
            }
            //从下到上
            for (int i = b; i >= t; i--) {
                res[index++] = matrix[i][l];
            }
            if (++l > r) {
                break;
            }
        }
        return res;
    }
}
