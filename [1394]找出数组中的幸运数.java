class Solution {

    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arr) {
            Integer count = map.getOrDefault(i, 0);
            count++;
            map.put(i, count);
        }
        int ans = -1;
        Integer key;
        Integer value;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (key.equals(value)) {
                ans = Math.max(key, ans);
            }
        }
        return ans;
    }
}
