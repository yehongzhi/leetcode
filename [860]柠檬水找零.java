class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            }
            if (bill == 10) {
                if (five > 0) {
                    five--;
                } else {
                    return false;
                }
                ten++;
            }
            if (bill == 20) {
                if (ten > 0) {
                    if (five > 0) {
                        ten--;
                        five--;
                    } else {
                        return false;
                    }
                } else {
                    if (five > 3) {
                        five -= 3;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
