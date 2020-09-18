class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode yaNode = new ListNode(val - 1);
        yaNode.next = head;
        ListNode curr = yaNode;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return yaNode.next;
    }
}
