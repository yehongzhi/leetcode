class Solution {
    public TreeNode increasingBST(TreeNode root) {
        //1.中序遍历放进一个集合中
        List<Integer> list = new LinkedList<>();
        inOrder(list, root);
        //创建一个只有右子节点的顺序查找数
        return dfs(list, 0, list.size() - 1);
    }

    private TreeNode dfs(List<Integer> list, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return null;
        }
        TreeNode root = new TreeNode(list.get(leftIndex));
        root.right = dfs(list, ++leftIndex, rightIndex);
        return root;
    }

    private void inOrder(List<Integer> list, TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrder(list, treeNode.left);
        list.add(treeNode.val);
        inOrder(list, treeNode.right);
    }
}
