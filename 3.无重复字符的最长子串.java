import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {

    /**
     * 
     * 执行结果：
     * 
     * 987/987 cases passed (19 ms) 
     * Your runtime beats 29.56 % of java submissions
     * Your memory usage beats 31.34 % of java submissions (37.6 MB)
     */
    public int lengthOfLongestSubstring(String s) {
        // 子串最长长度
        int ans = 0;
        // 左边子串下标
        int i = 0;
        // 右边子串下标
        int j = 0;
        // 输入的字符串长度
        int n = s.length();
        Set<Character> set = new HashSet<>();
        while (i < n && j < n) {
            // 如果不包含在集合中
            if (!set.contains(s.charAt(j))) {
                // 把字符串添加到集合中
                set.add(s.charAt(j));
                // 然后右边的下标+1
                j++;
                // 比较原来的长度和当前子串的长度，取最长的
                ans = ans > (j - i) ? ans : (j - i);
            }
            // 如果包含在里面，则把左边的字符从set集合中删除
            else {
                set.remove(s.charAt(i));
                // 左边的下标+1
                i++;
            }
        }
        return ans;
    }
}
// @lc code=end
