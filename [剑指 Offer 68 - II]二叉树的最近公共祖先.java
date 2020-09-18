class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode leftTreeNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightTreeNode = lowestCommonAncestor(root.right, p, q);
        if (leftTreeNode == null) {
            return rightTreeNode;
        }
        if (rightTreeNode == null) {
            return leftTreeNode;
        }
        return root;
    }
}
