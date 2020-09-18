class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, n, n, "");
        return res;
    }

    private void dfs(List<String> res, int left, int right, String str) {
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        if (left < 0) {
            return;
        }
        if (right < left) {
            return;
        }
        dfs(res, left - 1, right, str + "(");
        dfs(res, left, right - 1, str + ")");
    }
}
