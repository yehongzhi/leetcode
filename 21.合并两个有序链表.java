/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    /**
     * 思路：
     * 分别获取两个链表中的值，放到两个集合，把两个集合加到一起，然后排序
     * 再遍历集合，封装成链表返回
     * 
     * 结果：
     * 208/208 cases passed (45 ms)
     * Your runtime beats 84.88 % of java submissions
     * Your memory usage beats 21.59 % of java submissions (39.4 MB)
     * 
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        java.util.List<Integer> list1 = new java.util.ArrayList<>();
        java.util.List<Integer> list2 = new java.util.LinkedList<>();
        // 递归获取链表的值，放到两个集合
        getList(list1, l1);
        getList(list2, l2);
        // 把两个集合加在一起
        list1.addAll(list2);
        // 从小到大排序
        list1.sort(Integer::compareTo);
        if (list1.size() == 0) {
            return null;
        }
        // 定义一个起始节点
        ListNode l = new ListNode(list1.get(0));
        ListNode res = l;
        ListNode cl;
        for (int i = 1; i < list1.size(); i++) {
            cl = new ListNode(list1.get(i));
            l.next = cl;
            l = cl;
        }
        return res;
    }

    /**
     * 递归遍历链表的值，放到集合中
     * 
     * @param list
     * @param listNode
     */
    public void getList(java.util.List<Integer> list, ListNode listNode) {
        // 判断当前节点是否为空，不为空则把当前节点的值添加到集合中
        if (listNode == null)
            return;
        list.add(listNode.val);
        // 判断下一个节点的值是否为空，不为空则递归添加把下一个节点的值
        if (listNode.next != null)
            getList(list, listNode.next);
    }
}
// @lc code=end
