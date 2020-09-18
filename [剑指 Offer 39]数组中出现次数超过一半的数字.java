class Solution {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int low = 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[low] == nums[i]) {
                count++;
            } else {
                if (count > (length / 2)) {
                    return nums[low];
                }
                low = i;
                count = 1;
            }
        }
        if (count > (length / 2)) {
            return nums[length - 1];
        }
        return -1;
    }
}
