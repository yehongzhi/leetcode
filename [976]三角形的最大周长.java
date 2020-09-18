class Solution {
    //3,6,2,3  1,1,1,2,3,3,6   3 3 2
    public int largestPerimeter(int[] A) {
        //最大的数
        int a = getMax(A);
        //第二大的数
        int b = getMax(A);
        //第三大的数
        int c = getMax(A);
        while (c > 0) {
            //如果符合条件就返回
            if ((a + c) > b && (b + c) > a) {
                return a + b + c;
            } else {
                //如果不符合条件，a b c 三个数向后挪动一位
                a = b;
                b = c;
                c = getMax(A);
            }
        }
        return 0;
    }

    //获取最大的数，然后把最大的数改成0，也就是获取最大的数之后删掉它
    private int getMax(int[] A) {
        int maxIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }
        int max = A[maxIndex];
        A[maxIndex] = 0;
        return max;
    }
}
