class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = (int) Math.pow(A[i], 2);
        }
        Arrays.sort(res);
        return res;
    }
}
