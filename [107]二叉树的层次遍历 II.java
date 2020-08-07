//
// 例如： 
//给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其自底向上的层次遍历为： 
//
// [
//  [15,7],
//  [9,20],
//  [3]
//]
// 
// Related Topics 树 广度优先搜索


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        List<Integer> temp;
        while (!treeNodes.isEmpty()) {
            temp = new LinkedList<>();
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {
                //搜索并删除第一个元素
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
            res.addFirst(temp);
        }
        return res;
    }
}
