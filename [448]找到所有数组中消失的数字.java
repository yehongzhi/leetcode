class Solution {

    public int arrangeCoins(int n) {
        if (n <= 1) {
            return n;
        }
        int left = 1;
        int right = n;
        while (left + 1 < right) {
            int mid = (right + left) >>> 1;
            double partition = getCount(mid);
            if (partition == n) {
                return mid;
            } else if (partition < n) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private double getCount(int n) {
        return (double) (1 + n) * n / 2;
    }
}
