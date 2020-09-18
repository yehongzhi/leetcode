class Solution {

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(), A, B, C);
    }

    private void move(Integer n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1) {
            removeTo(A, C);
            return;
        }
        move(n - 1, A, C, B);
        removeTo(A, C);
        move(n - 1, B, A, C);
    }

    private void removeTo(List<Integer> l1, List<Integer> l2) {
        l2.add(l1.remove(l1.size() - 1));
    }
}
