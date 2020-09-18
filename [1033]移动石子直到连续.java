class Solution {

    public int[] numMovesStones(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        int min;
        if (c - a == 2) {
            min = 0;
        } else if (c - b == 1 || b - a == 1) {
            min = 1;
        } else if (c - b == 2 || b - a == 2) {
            min = 1;
        } else {
            min = 2;
        }
        return new int[]{min, c - a - 2};
    }
}
