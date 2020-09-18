class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int count = 0;
        int sum;
        while (i < flowerbed.length) {
            int num = flowerbed[i];
            if (num == 1) {
                break;
            }
            i++;
        }
        if (i == flowerbed.length) {
            sum = i % 2 == 0 ? i / 2 : (i + 1) / 2;
            return sum >= n;
        } else {
            sum = i % 2 == 0 ? i / 2 : (i - 1) / 2;
            if (sum >= n) {
                return true;
            }
        }
        count = 0;
        int k = flowerbed.length - 1;
        while (i < k) {
            if (flowerbed[k] == 1) {
                break;
            }
            count++;
            k--;
        }
        sum += count % 2 == 0 ? count / 2 : (count - 1) / 2;
        if (k == i) {
            return sum >= n;
        } else {
            while (i < k) {
                int l = i + 1;
                while (l < k) {
                    if (flowerbed[l] == 1) {
                        break;
                    }
                    l++;
                }
                int temp = l - i - 1;
                sum += temp % 2 == 0 ? (temp - 1) / 2 : temp / 2;
                if (sum >= n) {
                    return true;
                }
                i = l;
            }
            return false;
        }
    }
}
