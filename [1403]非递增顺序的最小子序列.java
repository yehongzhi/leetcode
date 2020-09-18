class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums.length == 1) {
            res.add(nums[0]);
            return res;
        }
        Arrays.sort(nums);
        int sum1 = Arrays.stream(nums).sum();
        int sum2 = 0;
        int maxIndex = nums.length - 1;
        int maxNum;
        while (sum2 <= sum1 && maxIndex >= 0) {
            maxNum = nums[maxIndex];
            res.add(maxNum);
            sum2 += maxNum;
            sum1 -= maxNum;
            maxIndex--;
        }
        return res;
    }
}
