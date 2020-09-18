class Solution {
    public int findPairs(int[] nums, int k) {
        int ans = 0;
        if (k < 0) {
            return ans;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Integer count;
        for (int num : nums) {
            count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num) > 1) {
                    ans++;
                }
            } else {
                if (map.containsKey(num + k)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
