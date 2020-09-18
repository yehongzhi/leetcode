class Solution {

    public boolean isMonotonic(int[] A) {
        int currIndex = 1;
        int preIndex = 0;
        //是否递增
        boolean flag;
        while (currIndex < A.length && A[currIndex] == A[preIndex]) {
            currIndex++;
            preIndex++;
        }
        if (currIndex == A.length) {
            //如果一直循环到末尾都是相等的，返回true
            return true;
        } else {
            //前面的数小于后面的数，就是递增
            flag = A[preIndex] < A[currIndex];
        }
        while (currIndex < A.length) {
            //如果是递增的情况
            if (flag) {
                //只要后面的数小于前面的数就返回false
                if (A[currIndex] < A[preIndex]) {
                    return false;
                }
            } else {
                //如果递减的情况，只要后面的数大于前面的数就返回false
                if (A[currIndex] > A[preIndex]) {
                    return false;
                }
            }
            preIndex++;
            currIndex++;
        }
        return true;
    }
}
