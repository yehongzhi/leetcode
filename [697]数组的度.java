class Solution {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.putIfAbsent(num, i);
            Integer count = countMap.getOrDefault(num, 0);
            count++;
            countMap.put(num, count);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            Integer count = countMap.get(num);
            if (count < max) {
                continue;
            }
            Integer index = map.get(num);
            int temp = i - index + 1;
            if (count == max) {
                min = Math.min(min, temp);
            } else {
                max = count;
                min = temp;
            }
            map.put(num, -1);
            countMap.put(num, -1);
        }
        return min;
    }
}
