class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {
        //喝了的瓶数
        int count = numBottles;
        //空瓶个数
        int kp = numBottles;
        //空瓶的个数大于可以兑换的瓶数就继续循环
        while (kp >= numExchange) {
            //能换多少瓶
            int exchangeNum = kp / numExchange;
            //换完之后剩下的
            int sy = kp % numExchange;
            //喝的瓶数增加
            count += exchangeNum;
            //喝完之后，空瓶个数
            kp = exchangeNum + sy;
        }
        return count;
    }
}
