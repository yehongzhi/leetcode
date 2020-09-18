class Solution {

    private int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, this.nums.length - 1);
    }

    private TreeNode helper(int left, int right) {
        if (left > right) {
            return null;
        }
        int temp = (left + right) / 2;
        TreeNode root = new TreeNode(this.nums[temp]);
        root.left = helper(left, temp - 1);
        root.right = helper(temp + 1, right);
        return root;
    }
}
