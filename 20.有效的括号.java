/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {

    // 有效的括号
    static String trueChars = "{},[],()";

    /**
     * 思路：
     * 先把空格去掉，去掉长度是奇数的情况
     * 递归删除有效的括号，判断删除后的字符长度是否等于0
     * 
     * 结果：
     * 76/76 cases passed (213 ms)
     * Your runtime beats 5.06 % of java submissions
     * Your memory usage beats 6.38 % of java submissions (36.4 MB)
     */
    public boolean isValid(String s) {
        // 如果为空返回false
        if (s == null)
            return false;
        // 空字符串是有效字符
        if ("".equals(s))
            return true;
        // 把空字符串都过滤掉
        s = s.replace(" ", "");
        // 判断如果字符长度是奇数，就不是有效字符串
        if (s.length() % 2 != 0)
            return false;
        // 判断最后的长度，如果长度==0就是有效的括号，如果删不尽，长度不等于0则不是有效括号
        return dealString(s) == 0;
    }

    /**
     * 递归删除有效括号，返回字符长度。如果删除完则返回0，删不完字符长度则大于0
     * 
     * @param s 递归删除的字符串
     * @return 字符长度
     */
    public int dealString(String s) {
        // 如果字符串长度为0，返回0
        if (s.length() == 0)
            return 0;
        String str;
        int index;
        for (int i = 0; i < s.length() - 1; i++) {
            // 把两个相邻的字符串拼接，判断是否是在有效的括号内
            str = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));
            // 如果是有效的括号
            if (trueChars.contains(str)) {
                // 把括号删掉
                index = s.indexOf(str);
                s = s.substring(0, index) + s.substring(index + 2);
                // 删掉之后，再递归删除
                return dealString(s);
            }
        }
        // 如果删不掉，则返回字符串长度
        return s.length();
    }
}
// @lc code=end
