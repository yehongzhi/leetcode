class Solution {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] ans = new int[len + 1];
        ans[0] = 0;
        ans[1] = nums[0];
        for (int i = 2; i <= len; i++) {
            ans[i] = Math.max(ans[i - 1], ans[i - 2] + nums[i - 1]);
        }
        return ans[len];
    }
}
