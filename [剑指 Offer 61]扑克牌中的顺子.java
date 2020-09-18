class Solution {

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;
            }
        }
        int star = count + 1;
        for (int i = star; i < nums.length; i++) {
            int dif = nums[i] - nums[i - 1];
            count = count - dif + 1;
            if (dif == 0 || count < 0) {
                return false;
            }
        }
        return true;
    }
}
