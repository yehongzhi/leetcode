class Solution {

    public boolean isUnique(String astr) {
        if (astr.length() < 2) {
            return true;
        }
        char[] chars = astr.toCharArray();
        Arrays.sort(chars);
        int i = 0;
        int j = 1;
        while (j < chars.length) {
            if (chars[i] == chars[j]) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
