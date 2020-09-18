class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode star = pre;
        ListNode end = pre;
        //预先遍历n位
        while (n != 0) {
            star = star.next;
            n--;
        }
        //star在n的位置，end在起点。一起遍历到结束，最后star在最后一位，end在倒数第n位
        while (star.next != null) {
            star = star.next;
            end = end.next;
        }
        //删除倒数第n位的数
        end.next = end.next.next;
        return pre.next;
    }
}
