/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    /**
     * 双指针方式 具体看注释和代码
     * 
     * 结果 
     * 161/161 cases passed (1 ms) 
     * Your runtime beats 100 % of java submissions
     * Your memory usage beats 52.96 % of java submissions (40.3 MB)
     */
    public int removeDuplicates(int[] nums) {
        // 排除数组长度为0和数组为null的情况
        if (nums == null || nums.length == 0)
            return 0;
        // 如果长度是数组长度是1，就返回1
        if (1 == nums.length) {
            return 1;
        }
        // 使用双指针方式，len在相邻的两个数值不相等时会+1，并且把不相同的数值赋值到len的下标位置
        // 相同时，i指针移动一格
        int len = 0;
        int i = 1;
        while (i < nums.length) {
            int curr = nums[len];
            int next = nums[i];
            if (curr == next) {
                i++;
            } else {
                len++;
                nums[len] = nums[i];
                i++;
            }
        }
        return len + 1;
    }
}
// @lc code=end
