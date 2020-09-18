class Solution {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int c = n % 26;
            sb.insert(0, (char) ('A' + c - 1));
            n /= 26;
        }
        return sb.toString();
    }
}
