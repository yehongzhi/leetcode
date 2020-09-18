class Solution {
    public int minArray(int[] numbers) {
        int i = 0;
        int min = Integer.MAX_VALUE;
        while (i < numbers.length) {
            min = Math.min(min, numbers[i]);
            i++;
        }
        return min;
    }
}
