class Solution {
    public int minDeletionSize(String[] A) {
        //需要删除的列数
        int count = 0;
        //col 列
        for (int c = 0; c < A[0].length(); c++) {
            //row 行
            for (int r = 0; r < A.length - 1; r++) {
                //同一列的当前行和下一行的字符对比，如果当前行的字符大于下一行的字符，就删除
                if (A[r].charAt(c) > A[r + 1].charAt(c)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
