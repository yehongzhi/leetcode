class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (char c1 : s.toCharArray()) {
            while (index < t.length()) {
                //比较字符是否相等，如果不相等，就比较t字符的下一个
                if (c1 != t.charAt(index)) {
                    //比较t字符的下一个
                    index++;
                } else {
                    //相等就比较s字符的下一个
                    break;
                }
            }
            //比较s字符的下一个
            index++;
        }
        //判断下标值是否在字符串t的长度内
        return index <= t.length();
    }
}
