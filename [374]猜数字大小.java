class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid;
        while (left <= right) {
            mid = (left + right) >>> 1;
            int guess = guess(mid);
            if (guess == -1) {
                right = mid - 1;
            } else if (guess == 1) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
