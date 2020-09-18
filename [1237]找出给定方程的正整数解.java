class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (customfunction.f(i, 1) > z) {
                break;
            }
            int left = 1;
            int right = 1000;
            while (left <= right) {
                int mid = (left + right) >>> 1;
                int temp = customfunction.f(i, mid);
                if (temp == z) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(mid);
                    res.add(list);
                    break;
                } else if (temp < z) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return res;
    }
}
