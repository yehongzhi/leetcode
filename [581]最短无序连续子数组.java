class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return 0;
        }
        int min = nums[length - 1];
        int max = nums[0];
        int left = 0;
        int right = -1;
        int index;
        for (int i = 0; i < length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            } else {
                right = i;
            }
            index = length - i - 1;
            if (nums[index] <= min) {
                min = nums[index];
            } else {
                left = index;
            }
        }
        return right - left + 1;
    }
}
