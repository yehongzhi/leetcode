class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        return findBadVersion(1, n, n);
    }

    private int findBadVersion(int left, int right, int res) {
        if (left > right) {
            return res;
        }
        int mid = left + ((right - left) >> 1);
        if (isBadVersion(mid)) {
            res = mid;
            right = mid - 1;
            return findBadVersion(left, right, res);
        } else {
            left = mid + 1;
            return findBadVersion(left, right, res);
        }
    }
}
