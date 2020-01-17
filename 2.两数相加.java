import java.math.BigDecimal;
/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start

//   Definition for singly-linked list.

class Solution {
    /**
     * 定义一个节点结构对象
     */

    /**
     * 题目：给出两个 非空 的链表用来表示两个非负的整数。 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /**
         * 自己做：暴力取巧
         * 结果：
         * 1563/1563 cases passed (13 ms)
         * Your runtime beats 5.81 % of java submissions
         * Your memory usage beats 68.36 % of java submissions (43.9 MB)
         */
        // 定义两个字符串存储l1和l2链表的值
        String a1 = "";
        String a2 = "";
        a1 = l1 == null ? "0" : l1.val + a1;
        a2 = l2 == null ? "0" : l2.val + a2;
        while (l1 != null) {
            l1 = l1.next;
            a1 = l1 == null ? a1 : l1.val + a1;
        }
        while (l2 != null) {
            l2 = l2.next;
            a2 = l2 == null ? a2 : l2.val + a2;
        }
        java.math.BigDecimal d1 = new java.math.BigDecimal(a1);
        java.math.BigDecimal d2 = new java.math.BigDecimal(a2);
        java.math.BigDecimal d3 = d1.add(d2);
        // 转换成字符数组
        char[] chars = d3.toPlainString().toCharArray();
        // 因为是逆序排列，所以取最后一个放在第一个节点
        ListNode l = new ListNode(Integer.valueOf(String.valueOf(chars[chars.length - 1])));
        // 定义返回结果链表p
        ListNode p = l;
        // 倒过来遍历数组，从倒数第二个开始加入到链表中
        for (int i = chars.length - 2; i >= 0; i--) {
            ListNode cl = new ListNode(Integer.valueOf(String.valueOf(chars[i])));
            // 放置当前节点的下一个节点
            l.next = cl;
            // 把下一个节点变成当前节点，继续遍历
            l = cl;
        }
        return p;
        /**
         * 官方解答
         * 1563/1563 cases passed (2 ms)
         * Your runtime beats 99.95 % of java submissions
         * Your memory usage beats 5.03 % of java submissions (45.2 MB)
         */
        // ListNode dummyHead = new ListNode(0);
        // ListNode p = l1, q = l2, curr = dummyHead;
        // int carry = 0;
        // while (p != null || q != null) {
        //     int x = (p != null) ? p.val : 0;
        //     int y = (q != null) ? q.val : 0;
        //     int sum = carry + x + y;
        //     carry = sum / 10;
        //     curr.next = new ListNode(sum % 10);
        //     curr = curr.next;
        //     if (p != null)
        //         p = p.next;
        //     if (q != null)
        //         q = q.next;
        // }
        // if (carry > 0) {
        //     curr.next = new ListNode(carry);
        // }
        // return dummyHead.next;
    }

}

// @lc code=end

