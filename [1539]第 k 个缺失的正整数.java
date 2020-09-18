class Solution {

    public int findKthPositive(int[] arr, int k) {
        boolean[] booleans = new boolean[2000];
        for (int i : arr) {
            booleans[i] = true;
        }
        int j = 1;
        int count = 0;
        while (j < 2000) {
            if (!booleans[j]) {
                count++;
            }
            if (count == k) {
                break;
            }
            j++;
        }
        return j;
    }
}
