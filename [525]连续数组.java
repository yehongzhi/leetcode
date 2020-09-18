class Solution {

    public int findMaxLength(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return 0;
        }
        int count = 0;
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 1) {
                count++;
            } else {
                count--;
            }
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLength;
    }
}
