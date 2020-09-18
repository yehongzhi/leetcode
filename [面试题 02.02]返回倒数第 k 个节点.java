class Solution {
    public int kthToLast(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int index = list.size() - k;
        return list.get(index);
    }
}
