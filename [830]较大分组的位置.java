class Solution {

    public List<List<Integer>> largeGroupPositions(String S) {
        if (S.length() < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length - 2; i++) {
            i = setResList(res, chars, i);
        }
        return res;
    }

    private int setResList(List<List<Integer>> res, char[] chars, int index) {
        char c1 = chars[index];
        int count = 1;
        int end = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = index + 1; i < chars.length; i++) {
            if (c1 == chars[i]) {
                count++;
                if (i == chars.length - 1) {
                    end = chars.length - 1;
                }
            } else {
                end = i - 1;
                break;
            }
        }
        if (count >= 3) {
            list.add(index);
            list.add(end);
            res.add(list);
        }
        return end;
    }
}
