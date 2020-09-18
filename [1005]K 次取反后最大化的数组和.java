class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        Arrays.sort(A);
        int minIndex = 0;
        for (int i = 0; i < K; i++) {
            int min = A[minIndex];
            sum -= min;
            min = -min;
            sum += min;
            A[minIndex] = min;
            if (minIndex + 1 < A.length && A[minIndex] > A[minIndex + 1]) {
                minIndex++;
            }
        }
        return sum;
    }
}
