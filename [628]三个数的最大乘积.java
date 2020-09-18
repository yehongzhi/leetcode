class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length - 1;
        int a = nums[len] * nums[len - 1] * nums[len - 2];
        int b = nums[0] * nums[1] * nums[len];
        return Math.max(a, b);
    }
}
