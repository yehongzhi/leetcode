class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        if (letters[0] > target || letters[right] < target) {
            return letters[0];
        }
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target >= letters[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return letters[left % letters.length];
    }
}
