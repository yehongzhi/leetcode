class Solution {

    public TreeNode invertTree(TreeNode root) {
        invertTheTree(root);
        return root;
    }

    private void invertTheTree(TreeNode root) {
        if (root == null) {
            return;
        }
        //交换
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) {
            invertTheTree(root.left);
        }
        if (root.right != null) {
            invertTheTree(root.right);
        }
    }
}
