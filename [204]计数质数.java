class Solution {
    public int countPrimes(int n) {
        //计数器
        int count = 0;
        //一个bool数组，记录是否是质数
        boolean[] booleans = new boolean[n];
        //从2开始遍历
        for (int i = 2; i < n; i++) {
            //如果位置的数是质数
            if (!booleans[i]) {
                //把质数的所有倍数(2、3、4...)的数都变成非质数
                for (int j = 2; j * i < n; j++) {
                    booleans[i * j] = true;
                }
                //质数的数量+1
                count++;
            }
        }
        //返回结果
        return count;
    }
}
