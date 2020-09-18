class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        boolean[] bool = new boolean[nums.length];
        for (int num : nums) {
            boolean b = bool[num - 1];
            if (!b) {
                bool[num - 1] = true;
            } else {
                res[0] = num;
            }
        }
        int i = 0;
        int j = bool.length - 1;
        while (i <= j) {
            if (!bool[i]) {
                res[1] = i + 1;
                return res;
            }
            if (!bool[j]) {
                res[1] = j + 1;
                return res;
            }
            i++;
            j--;
        }
        return res;
    }
}
