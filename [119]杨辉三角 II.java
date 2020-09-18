class Solution {
    public List<Integer> getRow(int rowIndex) {
        return generate(rowIndex + 1);
    }

    public List<Integer> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        LinkedList<List<Integer>> linkedList = new LinkedList<>();
        List<Integer> preList = null;
        List<Integer> res = null;
        int i = 1;
        while (true) {
            List<Integer> list = new LinkedList<>();
            //第三行开始，获取上一排数字
            if (i >= 3) {
                //为什么要-2呢，因为i是从1开始的
                preList = linkedList.get(i - 2);
            }
            for (int j = 1; j <= i; j++) {
                //第一位数和最后一位数是1
                if (j == 1 || j == i)
                    list.add(1);
                else {
                    //除了首位和末尾的数字以外的数字，获取上一排数的对应两个数字的相加的和
                    if (preList != null) {
                        list.add(preList.get(j - 2) + preList.get(j - 1));
                    }
                }
            }
            linkedList.add(list);
            if (i == numRows) {
                res = linkedList.getLast();
                break;
            }
            i++;
        }
        return res;
    }
}
