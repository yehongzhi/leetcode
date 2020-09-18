class Solution {

    private List<String> list = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        binaryTreePathString("", root);
        return list;
    }

    private void binaryTreePathString(String string, TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        //判断是叶子节点
        if (treeNode.left == null && treeNode.right == null) {
            String s = string + treeNode.val;
            list.add(s);
            return;
        }
        //左子节点为空，右子节点不为空
        if (treeNode.left == null) {
            //右子节点继续遍历下去
            binaryTreePathString(string + treeNode.val + "->", treeNode.right);
        //右子节点为空，左子节点不为空
        } else if (treeNode.right == null) {
            //左子节点遍历下去
            binaryTreePathString(string + treeNode.val + "->", treeNode.left);
        } else {
            //左右子节点都不为空，左右都遍历下去
            binaryTreePathString(string + treeNode.val + "->", treeNode.right);
            binaryTreePathString(string + treeNode.val + "->", treeNode.left);
        }
    }
}
