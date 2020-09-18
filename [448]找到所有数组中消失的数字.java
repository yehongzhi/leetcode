class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] bools = new boolean[nums.length + 1];
        for (int num : nums) {
            bools[num] = true;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < bools.length; i++) {
            if (!bools[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
