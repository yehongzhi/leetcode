class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        List<Integer> temp;
        while (!treeNodes.isEmpty()) {
            temp = new LinkedList<>();
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodes.poll();
                if (node != null) {
                    temp.add(node.val);
                    if (node.left != null) {
                        treeNodes.add(node.left);
                    }
                    if (node.right != null) {
                        treeNodes.add(node.right);
                    }
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
