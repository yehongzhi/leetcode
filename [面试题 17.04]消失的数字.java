class Solution {
    public int missingNumber(int[] nums) {
        boolean[] bools = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            bools[nums[i]] = true;
        }
        for (int i = 0; i < bools.length; i++) {
            if (!bools[i]) {
                return i;
            }
        }
        return -1;
    }
}
