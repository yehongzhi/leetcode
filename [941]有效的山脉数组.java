class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int index = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                index = i;
            } else if (A[i] == max) {
                return false;
            }
        }
        if (index == A.length - 1 || index == 0) {
            return false;
        }
        int left = index - 1;
        int leftCurr = index;
        int right = index + 1;
        int rightCurr = index;
        while (left >= 0) {
            if (A[left] >= A[leftCurr]) {
                return false;
            }
            left--;
            leftCurr--;
        }
        while (right < A.length) {
            if (A[right] >= A[rightCurr]) {
                return false;
            }
            right++;
            rightCurr++;
        }
        return true;
    }
}
