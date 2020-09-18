class Solution {

    private Map<Integer, Integer> cache = new HashMap<>();

    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        if (cache.get(N) != null) {
            return cache.get(N);
        } else {
            int num = fib(N - 1) + fib(N - 2);
            cache.put(N, num);
            return num;
        }
    }
}
