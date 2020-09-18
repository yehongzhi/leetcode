class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = 1;
        int count = 1;
        int i = 1;
        for (; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        if (i == nums.length) {
            max = Math.max(max, count);
        }
        return max;
    }
}
