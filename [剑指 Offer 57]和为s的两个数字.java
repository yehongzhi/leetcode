class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int sum;
        while (i < j) {
            sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{nums[i], nums[j]};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{};
    }
}
