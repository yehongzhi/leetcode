class Solution {
    public int missingNumber(int[] nums) {
        boolean[] bools = new boolean[nums.length + 1];
        for (int num : nums) {
            bools[num] = true;
        }
        int i = 0;
        while (bools[i]) {
            i++;
        }
        return i;
    }
}
