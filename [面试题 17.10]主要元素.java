class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;
        Integer count;
        for (int num : nums) {
            count = map.getOrDefault(num, 0);
            count++;
            map.put(num, count);
            if (count > n) {
                return num;
            }
        }
        return -1;
    }
}
