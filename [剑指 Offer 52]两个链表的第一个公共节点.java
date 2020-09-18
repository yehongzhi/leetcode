class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode curr = headA;
        while (curr != null) {
            set.add(curr);
            curr = curr.next;
        }
        ListNode curr1 = headB;
        while (curr1 != null) {
            if (set.contains(curr1)) {
                return curr1;
            }
            curr1 = curr1.next;
        }
        return null;
    }
}
