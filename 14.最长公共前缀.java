/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    /**
     * 思路： 获取数组中字符串长度最短的字符串作为基准值 
     * 用基准值的每一个下标对应的字符去对比数组中的字符串的下标对应的字符
     * 如果不相等，就截取字符串到此下标，然后跳出循环。以此类推，直到对比完最后一个字符串
     * 
     * 结果： 
     * 118/118 cases passed (3 ms) 
     * Your runtime beats 16.31 % of java
     * submissions Your memory usage beats 45.11 % of java submissions (37.5 MB)
     */
    public String longestCommonPrefix(String[] strs) {
        // 如果为null，返回空字符串
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 如果长度只有1，就返回本身
        if (strs.length == 1) {
            return strs[0];
        }
        // 获取基准值,长度最短作为基准值
        String firstString = strs[0];
        for (String string : strs) {
            firstString = string.length() < firstString.length() ? string : firstString;
        }
        // 从第二个开始
        String nextString;
        for (int i = 0; i < strs.length; i++) {
            // 遍历中的字符串
            nextString = strs[i];
            // 遍历基准的字符串
            for (int j = 0; j < firstString.length(); j++) {
                // 判断如果不相等就截取到
                if (!String.valueOf(firstString.charAt(j)).equals(String.valueOf(nextString.charAt(j)))) {
                    firstString = firstString.substring(0, j);
                    // 结束当前循环
                    break;
                }
            }
        }
        return firstString;
    }
}
// @lc code=end
