class Solution {

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] nums : grid) {
            int countRowNeg = countRowNeg(nums);
            count += countRowNeg;
        }
        return count;
    }

    private int countRowNeg(int[] nums) {
        int length = nums.length;
        int i = 0;
        while (i < length) {
            if (nums[i] < 0) {
                break;
            }
            i++;
        }
        return length - i;
    }
}
