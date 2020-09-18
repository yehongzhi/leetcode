class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int len = costs.length;
        int[] chat = new int[len];
        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            //全部去A城
            sum += costs[i][0];
            //B城到A城的差额，差额越小，表示去B城越划算
            chat[i] = costs[i][1] - costs[i][0];
        }
        //从小到大排序差额，前面一半的人去B城更划算
        Arrays.sort(chat);
        //找一半的人去B城
        for (int i = 0; i < chat.length / 2; i++) {
            sum += chat[i];
        }
        return sum;
    }
}
