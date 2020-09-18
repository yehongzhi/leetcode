class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int i = 1;
        int j = 2;
        while (j < nums.length) {
            if (nums[i] == nums[i - 1] && nums[i] == nums[j]) {
                j++;
            } else {
                nums[i + 1] = nums[j];
                i++;
                j++;
            }
        }
        return i + 1;
    }
}
