class Solution {
    public int[] masterMind(String solution, String guess) {
        char[] sChars = solution.toCharArray();
        char[] gChars = guess.toCharArray();
        int len = Math.min(sChars.length, gChars.length);
        int fCount = 0;
        for (int i = 0; i < len; i++) {
            char s = sChars[i];
            char g = gChars[i];
            if (s == g) {
                fCount++;
            }
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char sChar : sChars) {
            Integer count = map.getOrDefault(sChar, 0);
            count++;
            map.put(sChar, count);
        }
        int sum = 0;
        for (char gChar : gChars) {
            if (map.containsKey(gChar) && map.get(gChar) > 0) {
                sum++;
                map.put(gChar, map.get(gChar) - 1);
            }
        }
        return new int[]{fCount, sum - fCount};
    }
}
