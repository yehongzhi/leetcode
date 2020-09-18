class Solution {

    public int maxDistToClosest(int[] seats) {
        if (seats.length <= 2) {
            return 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int seat;
        for (int i = 0; i < seats.length; i++) {
            seat = seats[i];
            if (seat == 0) {
                count++;
            } else {
                if (count > 0) {
                    map.put(i - count, count);
                    count = 0;
                }
            }
        }
        if (count > 0) {
            map.put(seats.length - count, count);
        }
        int max = Integer.MIN_VALUE;
        Integer value;
        Integer key;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            value = entry.getValue();
            key = entry.getKey();
            int len;
            if (key == 0 || key + value == seats.length) {
                len = value;
            } else {
                len = value % 2 == 0 ? value / 2 : (value + 1) / 2;
            }
            if (len > max) {
                max = len;
            }
        }
        return max;
    }
}
