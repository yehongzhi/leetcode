class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null || root.children.size() == 0) {
            return 1;
        } else {
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (Node child : root.children) {
                int depth1 = maxDepth(child);
                linkedList.add(depth1);
            }
            return Collections.max(linkedList) + 1;
        }
    }
}
