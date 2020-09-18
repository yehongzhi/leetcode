class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.sort(nums);
        for (int num : nums) {
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                count++;
                map.put(num, count);
            }
        }
        int maxLength = 0;
        int preNum = Integer.MAX_VALUE;
        int preCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (preNum == Integer.MAX_VALUE) {
                preNum = entry.getKey();
                preCount = entry.getValue();
            } else {
                Integer currNum = entry.getKey();
                if ((currNum - preNum) == 1) {
                    maxLength = Math.max(entry.getValue() + preCount, maxLength);
                }
                preNum = currNum;
                preCount = entry.getValue();
            }
        }
        return maxLength;
    }
}
