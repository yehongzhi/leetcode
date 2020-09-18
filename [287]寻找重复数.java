class Solution {

    public int findDuplicate(int[] nums) {
        int high = nums.length - 1;
        int low = 1;
        int count;
        int mid;
        while (low < high) {
            count = 0;
            mid = (low + high) >>> 1;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
