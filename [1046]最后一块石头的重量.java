class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        //排序
        Arrays.sort(stones);
        //获取最大的数
        int maxIndex = stones.length - 1;
        int y = stones[maxIndex];
        //获取第二大的数
        int sceMaxIndex = stones.length - 2;
        int x = stones[sceMaxIndex];
        while (x > 0 && y > 0) {
            if (x == y) {
                x = 0;
                y = 0;
            } else if (x < y) {
                y = y - x;
                x = 0;
            }
            //碰撞后的石头放回到石头堆里
            stones[maxIndex] = y;
            stones[sceMaxIndex] = x;
            //排序
            Arrays.sort(stones);
            //获取最大的石头，第二大的石头
            x = stones[sceMaxIndex];
            y = stones[maxIndex];
        }
        return y;
    }
}
