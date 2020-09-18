class Solution {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        Arrays.sort(nums);
        int star = 0;
        int end = nums.length - 1;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list;
        while (star < end) {
            if (nums[star] + nums[end] == target) {
                list = new ArrayList<>();
                list.add(nums[star]);
                list.add(nums[end]);
                res.add(list);
                star++;
                end--;
            } else if (nums[star] + nums[end] > target) {
                end--;
            } else {
                star++;
            }
        }
        return res;
    }
}
