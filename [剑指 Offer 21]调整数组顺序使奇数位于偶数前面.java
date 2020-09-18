class Solution {

    public int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[j] = num;
                j--;
            } else {
                res[i] = num;
                i++;
            }
        }
        return res;
    }
}
