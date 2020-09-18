class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        int max = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                int count = 1;
                while (i < nums.length - 1 && nums[++i] == 1) {
                    count++;
                }
                max = Math.max(max, count);
            }
            i++;
        }
        return max;
    }
}
