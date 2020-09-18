class Solution {

    private Map<Integer, Integer> cache = new HashMap<>();

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int res = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        cache.put(n, res);
        return res;
    }
}
