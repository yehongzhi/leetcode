class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1) {
            return false;
        }
        int left = 0;
        int right = Math.min(k, nums.length);
        if (right == nums.length) {
            return isNearbyDuplicate(nums, left, right - 1);
        } else {
            while (right < nums.length) {
                if (isNearbyDuplicate(nums, left, right)) {
                    return true;
                }
                left++;
                right++;
            }
            return false;
        }
    }

    private boolean isNearbyDuplicate(int[] nums, int left, int right) {
        while (left < right) {
            if (nums[left] == nums[right]) {
                return true;
            }
            left++;
        }
        return false;
    }
}
