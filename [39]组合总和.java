class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        getResult(0, result, new ArrayList<>(), candidates, target);
        return result;
    }

    private void getResult(int star, List<List<Integer>> result, List<Integer> cur, int[] candidates, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = star; i < candidates.length; i++) {
            if (target < candidates[i]) {
                continue;
            }
            cur.add(candidates[i]);
            getResult(i, result, cur, candidates, target - candidates[i]);
            cur.remove(cur.size() - 1);
        }
    }
}
