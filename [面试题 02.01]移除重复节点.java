class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        //去重
        LinkedHashSet<Integer> linkedHashSet = getDuplicateNodes(head);
        ListNode pre = new ListNode(0);
        ListNode curr = pre;
        for (Integer num : linkedHashSet) {
            ListNode temp = new ListNode(num);
            curr.next = temp;
            curr = temp;
        }
        return pre.next;
    }

    private LinkedHashSet<Integer> getDuplicateNodes(ListNode head) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        while (head != null) {
            set.add(head.val);
            head = head.next;
        }
        return set;
    }
}
