class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            Integer v1 = list.get(left);
            Integer v2 = list.get(right);
            if (!v1.equals(v2)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
