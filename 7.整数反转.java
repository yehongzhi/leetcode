/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    /**
     * 题目： 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * 输入: 123
     * 输出: 321
     * 结果：
     * 1032/1032 cases passed (1 ms)
     * Your runtime beats 100 % of java submissions
     * Your memory usage beats 93.85 % of java submissions (33.4 MB)
     */
    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            // 每次循环n都进一位，比如：第一次循环n=10，第二次循环就是100
            n = n * 10 + x % 10;
            // 把最后一位数去掉，比如第一次循环是123，除以10就是12.3，保留整数就是10
            x = x / 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}
// @lc code=end
