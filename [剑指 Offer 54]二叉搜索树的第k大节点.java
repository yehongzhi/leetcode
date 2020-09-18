class Solution {

    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        getList(list, root);
        return list.get(list.size() - k);
    }

    private void getList(List<Integer> list, TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.left != null) {
            getList(list, treeNode.left);
        }
        list.add(treeNode.val);
        if (treeNode.right != null) {
            getList(list, treeNode.right);
        }
    }
}
