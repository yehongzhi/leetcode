class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 3];
        for (int i = 2; i < dp.length - 1; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i - 2];
        }
        dp[dp.length - 1] = Math.min(dp[dp.length - 2], dp[dp.length - 3]);
        return dp[dp.length - 1];
    }
}
