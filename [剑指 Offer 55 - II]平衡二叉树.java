class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
            return false;
        }
        return dfs(root.left) && dfs(root.right);
    }

    private int maxDepth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return Math.max(maxDepth(treeNode.left), maxDepth(treeNode.right)) + 1;
    }
}
