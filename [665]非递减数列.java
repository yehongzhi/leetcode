class Solution {

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length && count <= 1; i++) {
            //当前的数小于前面一个数，也就是递减了
            if (nums[i - 1] > nums[i]) {
                count++;
                if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                    //如果当前i的数比前面i-2的数要小，那么就把当前i的数赋值为i-1的数，因为i-1的数是大于或等于i-2的数的。
                    nums[i] = nums[i - 1];
                } else {
                    //需要把当前的数的值赋值到前面的数
                    nums[i - 1] = nums[i];
                }
            }
        }
        return count <= 1;
    }
}
