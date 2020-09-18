class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        int iCount = x == 1 ? 0 : (int) (Math.log(bound) / Math.log(x));
        int jCount = y == 1 ? 0 : (int) (Math.log(bound) / Math.log(y));
        boolean flag = false;
        for (int i = 0; i <= iCount; i++) {
            for (int j = 0; j <= jCount; j++) {
                int sum = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (sum <= bound) {
                    set.add(sum);
                } else if (j > 0) {
                    break;
                } else {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return new ArrayList<>(set);
    }
}
