class Solution {

    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            int temp = A[mid];
            int pre = A[mid - 1];
            int next = A[mid + 1];
            if (pre < temp && temp < next) {
                left = mid;
            } else if (pre > temp && temp > next) {
                right = mid;
            } else {
                return mid;
            }
        }
        return left;
    }

    public int peakIndexInMountainArray1(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            int a = A[i];
            int next = A[i + 1];
            if (a > next) {
                return i;
            }
        }
        return -1;
    }
}
