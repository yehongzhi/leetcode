class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode treeNode) {
        if (treeNode == null) {
            //如果节点为空，返回true
            return true;
        }
        //判断当前节点的左子节点最大深度和右子节点最大深度是否超过1
        if (Math.abs(depth(treeNode.left) - depth(treeNode.right)) > 1) {
            return false;
        }
        //判断当前节点的左右子节点是否符合平衡
        return dfs(treeNode.left) && dfs(treeNode.right);
    }

    //获取节点最大深度
    private int depth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return Math.max(depth(treeNode.left), depth(treeNode.right)) + 1;
    }
}
