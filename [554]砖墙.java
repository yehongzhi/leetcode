class Solution {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                int count = map.getOrDefault(sum, 0);
                count++;
                map.put(sum, count);
            }
        }
        int res = wall.size();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res = Math.min(res, wall.size() - entry.getValue());
        }
        return res;
    }
}
