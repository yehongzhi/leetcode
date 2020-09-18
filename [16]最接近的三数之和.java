class Solution {

    public int threeSumClosest(int[] nums, int target) {
        //先排序
        Arrays.sort(nums);
        int len = nums.length;
        int best = 10000000;
        int j;
        int k;
        int sum;
        int nk;
        int nj;
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            j = i + 1;
            k = len - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    nk = nums[k];
                    k--;
                    while (j < k && nums[k] == nk) {
                        k--;
                    }
                } else {
                    nj = nums[j];
                    j++;
                    while (j < k && nums[j] == nj) {
                        j++;
                    }
                }
            }
        }
        return best;
    }
}
