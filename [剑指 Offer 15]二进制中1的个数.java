class Solution {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if ('1' == c) {
                count++;
            }
        }
        return count;
    }
}
