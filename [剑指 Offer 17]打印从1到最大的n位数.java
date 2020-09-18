class Solution {

    public int[] printNumbers(int n) {
        int max = 1;
        for (int i = 0; i < n; i++) {
            max *= 10;
        }
        int[] res = new int[max - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
