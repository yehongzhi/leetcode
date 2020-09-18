class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list.add(l2.val);
            l2 = l2.next;
        }
        list.sort(Integer::compareTo);
        ListNode pre = new ListNode(0);
        ListNode curr = pre;
        for (Integer integer : list) {
            curr.next = new ListNode(integer);
            curr = curr.next;
        }
        return pre.next;
    }
}
