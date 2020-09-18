class Solution {

    public int findRadius(int[] houses, int[] heaters) {
        int res = -1;
        for (int house : houses) {
            res = Math.max(res, findNearest(house, heaters));
        }
        return res;
    }

    private int findNearest(int n, int[] heaters) {
        int ans = Integer.MAX_VALUE;
        for (int heater : heaters) {
            ans = Math.min(ans, Math.abs(heater - n));
        }
        return ans;
    }
}
