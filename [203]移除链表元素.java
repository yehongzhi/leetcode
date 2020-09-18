class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(val - 1);
        pre.next = head;
        ListNode node = pre;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return pre.next;
    }
}
