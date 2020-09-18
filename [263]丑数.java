class Solution {

    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        int[] chuShuNums = new int[]{2, 3, 5};
        for (int chuShuNum : chuShuNums) {
            num = isUglyNumber(num, chuShuNum);
            if (num == 1) {
                return true;
            }
        }
        return false;
    }

    private int isUglyNumber(int num, int chuShu) {
        while (num % chuShu == 0) {
            num /= chuShu;
            if (num == 1) {
                return 1;
            }
        }
        return num;
    }
}
