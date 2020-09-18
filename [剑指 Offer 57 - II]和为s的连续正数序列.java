class Solution {

    public int[][] findContinuousSequence(int target) {
        int max = target / 2 + 1;
        List<int[]> list = new ArrayList<>();
        int star = 1;
        int end = star + 1;
        int sum = star + end;
        int[] nums;
        while (star < end && end <= max) {
            if (sum == target) {
                nums = new int[end - star + 1];
                for (int i = star; i <= end; i++) {
                    nums[i - star] = i;
                }
                list.add(nums);
                sum -= star;
                star++;
            } else if (sum < target) {
                end++;
                sum += end;
            } else {
                sum -= star;
                star++;
            }
        }
        return list.toArray(new int[0][0]);
    }

    private int getSum(int star, int end) {
        int sum = 0;
        for (int i = star; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
