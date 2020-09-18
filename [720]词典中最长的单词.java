class Solution {
    public String longestWord(String[] words) {
        String res = "";
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            if (word.length() > res.length() || (res.length() == word.length() && word.compareTo(res) < 0)) {
                boolean flag = true;
                for (int i = 1; i < word.length(); i++) {
                    if (!wordSet.contains(word.substring(0, i))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    res = word;
                }
            }
        }
        return res;
    }
}
