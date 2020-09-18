class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int index = -1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            int temp = nums[mid];
            if (temp == target) {
                index = mid;
                break;
            } else if (temp < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (index == -1) {
            return 0;
        } else {
            int count = 1;
            int i = index - 1;
            while (i >= 0 && nums[i] == target) {
                i--;
                count++;
            }
            int k = index + 1;
            while (k < nums.length && nums[k] == target) {
                k++;
                count++;
            }
            return count;
        }
    }
}
