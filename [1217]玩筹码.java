class Solution {
    public int minCostToMoveChips(int[] chips) {
        int qiShu = 0;
        int ouShu = 0;
        for (int chip : chips) {
            if (chip % 2 == 0) {
                ouShu++;
            } else {
                qiShu++;
            }
        }
        return Math.min(qiShu, ouShu);
    }
}
