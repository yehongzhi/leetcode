/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    /**
     * 思路：转成字符串，然后反转过来。判断原来的字符串和反转后的字符串是否相等
     * 
     * 使用String拼接字符串的结果
     * 11509/11509 cases passed (13 ms)
     * Your runtime beats 25.51 % of java submissions
     * Your memory usage beats 33.85 % of java submissions (36.6 MB)
     * 
     * 使用StringBuilder拼接字符串，优化后：
     * 11509/11509 cases passed (11 ms) 快了两毫秒
     * Your runtime beats 51.09 % of java submissions
     * Your memory usage beats 9.8 % of java submissions (37.1 MB)
     */
    public boolean isPalindrome(int x) {
        // 如果是负数，肯定不是回文数
        if (x < 0) {
            return false;
        }
        // 输入的数字转换成字符串
        String soureString = String.valueOf(Integer.valueOf(x));
        // 转成字符数组
        char[] chars = soureString.toCharArray();
        // 遍历数组，反转过来
        StringBuilder targetString = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            targetString.append(chars[i]);
        }
        // 判断是否是回文数
        return targetString.toString().equals(soureString);
    }
}
// @lc code=end
