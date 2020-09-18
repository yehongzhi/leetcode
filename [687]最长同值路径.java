class Solution {

    private int max = Integer.MIN_VALUE;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxUnivaluePath(root);
        return max;
    }

    private int maxUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxUnivaluePath(root.left);
        int right = maxUnivaluePath(root.right);
        int leftDir = 0;
        int rightDir = 0;
        if (root.left != null && root.left.val == root.val) {
            leftDir = left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            rightDir = right + 1;
        }
        max = Math.max(max, rightDir + leftDir);
        return Math.max(leftDir, rightDir);
    }
}
