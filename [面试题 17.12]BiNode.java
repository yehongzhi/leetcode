class Solution {

    public TreeNode convertBiNode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(list, root);
        list.sort(Integer::compareTo);
        TreeNode pre = new TreeNode(0);
        TreeNode curr = pre;
        for (Integer value : list) {
            curr.right = new TreeNode(value);
            curr = curr.right;
        }
        return pre.right;
    }

    private void dfs(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        if (node.left != null) {
            dfs(list, node.left);
        }
        if (node.right != null) {
            dfs(list, node.right);
        }
    }
}
