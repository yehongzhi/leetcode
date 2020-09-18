class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers.length == 2) {
            res[0] = 1;
            res[1] = 2;
            return res;
        }
        int left = 0;
        int right = numbers.length - 1;
        while (true) {
            int val = numbers[left] + numbers[right];
            if (val > target) {
                right--;
            } else if (val < target) {
                left++;
            } else {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
        }
    }
}
