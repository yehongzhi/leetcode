class Solution {

    public int waysToStep(int n) {
        int[] res = new int[]{0, 1, 2, 4};
        if (n <= 3) {
            return res[n];
        }
        long[] dp = new long[n + 1];
        for (int i = 0; i < res.length; i++) {
            dp[i] = res[i];
        }
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % 1000000007;
        }
        return (int) dp[n];
    }
}
