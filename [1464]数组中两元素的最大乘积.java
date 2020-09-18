class Solution {

    public int maxProduct(int[] nums) {
        int max1 = getMax(nums);
        int max2 = getMax(nums);
        return (max1 - 1) * (max2 - 1);
    }

    private int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                index = i;
            }
        }
        nums[index] = Integer.MIN_VALUE;
        return max;
    }
}
