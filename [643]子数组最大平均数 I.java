class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int i = 0;
        for (; i < k; i++) {
            sum += nums[i];
        }
        int temp = sum;
        for (; i < nums.length; i++) {
            temp = temp - nums[i - k] + nums[i];
            sum = Math.max(sum, temp);
        }
        return (double) sum / k;
    }
}
