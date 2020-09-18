class Solution {

    private List<Integer> list = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        list.sort(Integer::compareTo);
        int i = 0;
        int j = 1;
        int res = Integer.MAX_VALUE;
        for (; j < list.size(); j++) {
            res = Math.min(res, list.get(j) - list.get(i));
            i++;
        }
        return res;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        if (node.left != null) {
            dfs(node.left);
        }
        if (node.right != null) {
            dfs(node.right);
        }
    }
}
