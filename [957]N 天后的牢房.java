class Solution {

    public int[] prisonAfterNDays(int[] cells, int N) {
        N = (N - 1) % 14 + 1;
        for (int i = 0; i < N; i++) {
            cells = prison(cells);
        }
        return cells;
    }

    private int[] prison(int[] cells) {
        int i = 1;
        int pre = i - 1;
        int next = i + 1;
        int[] res = new int[cells.length];
        if (cells.length < 3) {
            return new int[cells.length];
        }
        for (; i < cells.length - 1; i++) {
            if ((cells[pre] == 1 && cells[next] == 1) || (cells[pre] == 0 && cells[next] == 0)) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
            pre++;
            next++;
        }
        return res;
    }
}
