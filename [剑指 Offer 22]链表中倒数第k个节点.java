class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int star = list.size() - k;
        if (star < 0) {
            return null;
        }
        ListNode pre = new ListNode(0);
        ListNode curr = pre;
        for (int i = star; i < list.size(); i++) {
            ListNode temp = new ListNode(list.get(i));
            curr.next = temp;
            curr = temp;
        }
        return pre.next;
    }
}
