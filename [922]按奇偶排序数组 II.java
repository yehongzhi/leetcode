class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int index1 = 0;
        int index2 = 1;
        int[] res = new int[A.length];
        for (int value : A) {
            if (value % 2 != 0) {
                res[index2] = value;
                index2 += 2;
            } else {
                res[index1] = value;
                index1 += 2;
            }
        }
        return res;
    }
}
