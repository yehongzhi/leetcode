package leetcode.editor.cn;//给定两个二叉树，编写一个函数来检验它们是否相同。
//
// 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。 
//
// 示例 1: 
//
// 输入:       1         1
//          / \       / \
//         2   3     2   3
//
//        [1,2,3],   [1,2,3]
//
//输出: true 
//
// 示例 2: 
//
// 输入:      1          1
//          /           \
//         2             2
//
//        [1,2],     [1,null,2]
//
//输出: false
// 
//
// 示例 3: 
//
// 输入:       1         1
//          / \       / \
//         2   1     1   2
//
//        [1,2,1],   [1,1,2]
//
//输出: false
// 
// Related Topics 树 深度优先搜索


//leetcode submit region begin(Prohibit modification and deletion)


// Definition for a binary tree node.
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String s1 = treeToString(p);
        String s2 = treeToString(q);
        return s1.equals(s2);
    }

    private String treeToString(TreeNode treeNode) {
        if (treeNode == null) {
            return "null";
        }
        String leftTreeString = treeToString(treeNode.left);
        String rightTreeString = treeToString(treeNode.right);
        return treeNode.val + leftTreeString + rightTreeString;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
