class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[]{};
        }
        Set<Integer> set = new LinkedHashSet<>();
        int i = 0;
        while (k >= 0) {
            set.add((shorter * k) + (longer * i));
            k--;
            i++;
        }
        int[] res = new int[set.size()];
        int j = 0;
        for (Integer value : set) {
            res[j] = value;
            j++;
        }
        return res;
    }
}
