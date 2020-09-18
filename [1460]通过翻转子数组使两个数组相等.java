class Solution {

    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer c;
        for (int value : target) {
            c = map.get(value);
            if (c == null) {
                map.put(value, 1);
            } else {
                c++;
                map.put(value, c);
            }
        }
        Integer count;
        for (int i : arr) {
            count = map.get(i);
            if (count == null || count == 0) {
                return false;
            } else {
                count--;
                map.put(i, count);
            }
        }
        return true;
    }
}
