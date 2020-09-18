class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0] == 0 ? 1 : 0;
        }
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (mid == 0) {
                break;
            }
            if (nums[mid - 1] == mid - 1 && nums[mid] == mid + 1) {
                return mid;
            } else if (nums[mid - 1] == mid - 1 && nums[mid] == mid) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
