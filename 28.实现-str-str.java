/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    /**
     * 执行结果：
     * 
     * 74/74 cases passed (1 ms) 
     * Your runtime beats 77.5 % of java submissions 
     * Your memory usage beats 55.37 % of java submissions (37.4 MB)
     *
     */
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        if (haystack.length() < needle.length())
            return -1;
        if (needle == "") {
            return 0;
        }
        // 获取需要循环的次数
        // 例如：haystack = "hello", needle = "ll"
        // 算出来，里面就有 5 - 2 + 1 = 4，有4个相邻的2位字符
        int num = haystack.length() - needle.length() + 1;
        int length = needle.length();
        for (int i = 0; i < num; i++) {
            // 截取和目标字符串相同长度的字符串，进行比较
            String s = haystack.substring(i, i + length);
            // 如果匹配相等，则返回下标值
            if (needle.equals(s)) {
                return i;
            }
        }
        // 没有匹配则返回-1
        return -1;
    }
}
// @lc code=end
