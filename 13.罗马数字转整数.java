/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {

    static java.util.Map<String, Integer> map = new java.util.HashMap<>();

    static{
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }

    /**
     * 思路：
     * 把特殊的6种情况，当做5-1，,10-1,50-10,100-10。。。。的情况
     * 这样就可以把 IV 当做是 -1 + 5 处理
     * 
     * 结果：
     * 3999/3999 cases passed (7 ms)
     * Your runtime beats 67.83 % of java submissions
     * Your memory usage beats 48.11 % of java submissions (36.6 MB)
     */
    public int romanToInt(String s) {
        // 如果为空则返回0
        if (s == null) {
            return 0;
        }
        // 定义结果初始值
        int res = 0;
        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 获取到当前的值
            int currInt = map.get(String.valueOf(s.charAt(i)));
            // 获取下一个值,如果是最后一个元素就不获取了
            int nextInt = i < s.length() - 1 ? map.get(String.valueOf(s.charAt(i + 1))) : 0;
            //如果当前的值小于下一个值，则相当于加上当前值的负数，否则加上当前值
            res += currInt < nextInt ? -currInt : currInt;
        }
        return res;
    }
}
// @lc code=end
