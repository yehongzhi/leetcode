class Solution {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        for (int i : A) {
            sumA += i;
        }
        int sumB = 0;
        for (int i : B) {
            sumB += i;
        }
        int num1;
        int num2;
        for (int a : A) {
            num1 = sumA - a;
            for (int b : B) {
                num2 = sumB - b;
                if ((num1 + b) == (num2 + a)) {
                    return new int[]{a, b};
                }
            }
        }
        return new int[]{};
    }
}
