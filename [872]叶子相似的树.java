class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new LinkedList<>();
        dfs(list1, root1);
        List<Integer> list2 = new LinkedList<>();
        dfs(list2, root2);
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void dfs(List<Integer> list, TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.left == null && treeNode.right == null) {
            list.add(treeNode.val);
        } else {
            dfs(list, treeNode.right);
            dfs(list, treeNode.left);
        }
    }
}
