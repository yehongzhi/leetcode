import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    /**
     * 
     * 执行结果：
     * 
     * 113/113 cases passed (1 ms) 
     * Your runtime beats 11.91 % of java submissions
     * Your memory usage beats 20.41 % of java submissions (35.5 MB)
     * 
     */
    public int removeElement(int[] nums, int val) {
        // 如果为空，或者长度为0则返回0
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // 记录有多少个等于目标元素的
        int count = 0;
        for (int num : nums) {
            if (num == val)
                count++;
        }
        // 如果没有目标元素，则返回数组长度
        if (count == 0) {
            return nums.length;
        }
        // 先从小到大排序，假设输入是 [0,1,2,2,3,0,4,2]
        Arrays.sort(nums);
        // 排序后的数组是 [0,0,1,2,2,2,3,4]
        // 记录与目标元素相同的元素的下标 以例子中的数据，下标是3
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                index = i;
                break;
            }
        }
        // 获取数组最后一个元素的下标
        int length = nums.length - 1;
        // 循环遍历，循环次数是相同的元素的个数
        /**
         * [0,0,1,2,2,2,3,4] 这个例子就遍历三次
         *        |       |  下标3的和最后一个交换值
         *          |   |    下标4的和倒数第二个交换值
         *            |      下标5的和倒数第三个交换值（这里就自己跟自己交换，问题不大）
         */
        int temp;
        for (int i = 0; i < count; i++) {
            temp = nums[length];
            nums[length] = nums[index];
            nums[index] = temp;
            // 目标元素的下标+1
            index++;
            // 最后一个元素的下标－1
            length--;
        }
        //结果就是 [0,0,1,3,4,2,2,2] 返回长度是5
        // 数组长度减去相同的元素的数量就是新的长度
        return nums.length - count;
    }
    /**
     * 官方解法：
     * 采用双指针
     * 思路：
     * 当 nums[j] 与给定的值相等时，递增 j 以跳过该元素。
     * 只要 nums[j] != val，我们就复制 nums[j] 到 nums[i]并同时递增两个索引。
     * 重复这一过程，直到 j 到达数组的末尾，该数组的新长度为 i。
     *
     * public int removeElement(int[] nums, int val) {
     *  int i = 0;
     *  for (int j = 0; j < nums.length; j++) {
     *      if (nums[j] != val) {
     *          nums[i] = nums[j];
     *          i++;
     *      } 
     *  }
     *  return i; 
     * }
     */
}
// @lc code=end
