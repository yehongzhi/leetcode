class Solution {

    private int ans = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        dfs(root, L, R);
        return ans;
    }

    private void dfs(TreeNode node, int L, int R) {
        if (node == null) {
            return;
        }
        int currVal = node.val;
        if (currVal >= L && currVal <= R) {
            ans += currVal;
        }
        if (currVal > L) {
            dfs(node.left, L, R);
        }
        if (currVal < R) {
            dfs(node.right, L, R);
        }
    }
}
