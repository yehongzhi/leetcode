class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int size = salary.length - 2;
        for (int num : salary) {
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return (double) (sum - max - min) / size;
    }
}
