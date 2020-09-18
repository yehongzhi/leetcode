class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null || g.length == 0 || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int sIndex = s.length - 1;
        int gIndex = g.length - 1;
        int count = 0;
        while (gIndex >= 0 && sIndex >= 0) {
            int gNum = g[gIndex];
            int sNum = s[sIndex];
            if (gNum <= sNum) {
                gIndex--;
                sIndex--;
                count++;
            } else {
                gIndex--;
            }
        }
        return count;
    }
}
