class Solution {

    public int[] reversePrint(ListNode head) {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int[] res = new int[list.size()];
        int j = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            res[j] = list.get(i);
            j++;
        }
        return res;
    }
}
