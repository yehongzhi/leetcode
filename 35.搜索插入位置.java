/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    /**
     * 执行结果：
     * 
     * 62/62 cases passed (1 ms) 
     * Your runtime beats 7.54 % of java submissions 
     * Your memory usage beats 31.81 % of java submissions (38.9 MB)
     */
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // 如果数组长度等于1，特殊处理
        if (nums.length == 1) {
            int num = nums[0];
            if (target < num || target == num) {
                return 0;
            } else {
                return 1;
            }
        }
        int num;
        int next;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                if (nums[i] == target) {
                    return i;
                } else {
                    return i + 1;
                }
            }
            num = nums[i];
            if (num == target) {
                return i;
            }
            next = nums[i + 1];
            if (target < next) {
                if (i == 0) {
                    if (target < num) {
                        return 0;
                    } else {
                        return i + 1;
                    }
                } else {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}
// @lc code=end
