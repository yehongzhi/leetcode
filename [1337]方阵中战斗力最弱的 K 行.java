class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] nums = new int[k];
        for (int i = 0; i < k; i++) {
            int min = getMin(mat);
            nums[i] = min;
        }
        return nums;
    }

    private int getMin(int[][] mat) {
        int minIndex = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int[] nums = mat[i];
            int weak = 0;
            for (int j = 0; j < nums.length; j++) {
                int num = nums[j];
                if (num == -1) {
                    break;
                }
                if (num == 0 || j == nums.length - 1) {
                    if (num == 1) {
                        weak++;
                    }
                    if (weak < min) {
                        minIndex = i;
                        min = weak;
                    }
                    break;
                } else {
                    weak++;
                }
            }
        }
        for (int k = 0; k < mat[minIndex].length; k++) {
            mat[minIndex][k] = -1;
        }
        return minIndex;
    }
}
