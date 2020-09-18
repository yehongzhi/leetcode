class Solution {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int res = 0;
        while (i < nums.length - 1) {
            int curr = nums[i];
            int next = nums[i + 1];
            res += Math.min(curr, next);
            i += 2;
        }
        return res;
    }
}
