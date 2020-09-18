class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[]{};
        }
        int i = k - 1;
        List<Integer> list = new ArrayList<>();
        int max;
        for (; i < nums.length; i++) {
            max = getMax(nums, i, k);
            list.add(max);
        }
        int[] res = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            res[j] = list.get(j);
        }
        return res;
    }

    private int getMax(int[] nums, int i, int k) {
        int left = i + 1 - k;
        int max = Integer.MIN_VALUE;
        while (i >= left) {
            max = Math.max(max, nums[i]);
            i--;
        }
        return max;
    }
}
