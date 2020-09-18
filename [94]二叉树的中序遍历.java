class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversal(res, root);
        return res;
    }

    private void inorderTraversal(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorderTraversal(list, root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            inorderTraversal(list, root.right);
        }
    }
}
