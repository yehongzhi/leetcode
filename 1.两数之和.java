/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (target - nums[j] == nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[]{};
    }
}
// @lc code=end
