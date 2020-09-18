class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode tempA = headA;
        while (tempA != null) {
            set.add(tempA);
            tempA = tempA.next;
        }
        ListNode tempB = headB;
        while (tempB != null) {
            if (set.contains(tempB)) {
                return tempB;
            }
            tempB = tempB.next;
        }
        return null;
    }
}
