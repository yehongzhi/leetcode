class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] hashStr = new String[26];
        char[] chars = pattern.toCharArray();
        String[] strings = str.split(" ");
        if (chars.length != strings.length) {
            return false;
        }
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int hashcode = ch - 'a';
            String s = hashStr[hashcode];
            if (s == null) {
                String strings1 = strings[i];
                Character character = map.get(strings1);
                if (character != null) {
                    return false;
                }
                hashStr[hashcode] = strings1;
                map.put(strings1, ch);
            } else {
                if (!s.equals(strings[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
