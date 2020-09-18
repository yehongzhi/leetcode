class Solution {

    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int[] dp = new int[words.length];
        int ans = 0;
        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < i; j++) {
                if (contain(words[i], words[j])) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    ans = Math.max(dp[i], ans);
                }
            }
        }
        return ans + 1;
    }

    //判断s2是否为s1的前身
    private boolean contain(String s1, String s2) {
        if (s1.length() != s2.length() + 1) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s2.length();
    }
}
