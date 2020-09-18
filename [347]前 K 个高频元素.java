class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<Integer>[] lists = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer index = entry.getValue();
            if (lists[index] == null) {
                lists[index] = new ArrayList<>();
            }
            lists[index].add(entry.getKey());
        }
        List<Integer> res = new ArrayList<>();
        for (int i = lists.length - 1; i >= 0 && res.size() < k; i--) {
            if (lists[i] == null) {
                continue;
            }
            res.addAll(lists[i]);
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
