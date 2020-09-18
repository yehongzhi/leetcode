class Solution {

    public List<Integer> addToArrayForm(int[] A, int K) {
        java.math.BigDecimal bei = new java.math.BigDecimal(1);
        java.math.BigDecimal sum = new java.math.BigDecimal(K);
        java.math.BigDecimal a;
        for (int i = A.length - 1; i >= 0; i--) {
            a = new java.math.BigDecimal(A[i]);
            sum = sum.add(a.multiply(bei));
            bei = bei.multiply(new java.math.BigDecimal("10"));
        }
        List<Integer> res = new ArrayList<>();
        for (char c : sum.toPlainString().toCharArray()) {
            res.add(c - 48);
        }
        return res;
    }
}
