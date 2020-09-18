class Solution {
    public boolean canWinNim(int n) {
        //4颗石头，先手必输
        //8颗石头，先手拿1-3颗，剩下5-7颗。对面可以拿到只剩下4颗给回你，必输
        //
        return n % 4 != 0;
    }
}
