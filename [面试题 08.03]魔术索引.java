class Solution {
    public int findMagicIndex(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                return i;
            } else if (nums[i] > i) {
                i = nums[i];
            } else {
                i++;
            }
        }
        return -1;
    }
}
