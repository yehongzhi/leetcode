class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
/**
 * 另一种解法
 *     public boolean hasCycle(ListNode head) {
 *         Set<ListNode> set = new HashSet<>();
 *         while (head != null) {
 *             if (set.contains(head)) {
 *                 return true;
 *             } else {
 *                 set.add(head);
 *             }
 *             head = head.next;
 *         }
 *         return false;
 *     }
 * */
