class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int index = (left + right) / 2;
        TreeNode root = new TreeNode(nums[index]);
        root.left = dfs(nums, left, index - 1);
        root.right = dfs(nums, index + 1, right);
        return root;
    }
}
