class Solution {

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length < 3) {
            return true;
        }
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] - arr[i] != d) {
                return false;
            }
            i++;
        }
        return true;
    }
}
