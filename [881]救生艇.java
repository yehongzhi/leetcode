class Solution {

    public int numRescueBoats(int[] people, int limit) {
        //先排序
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        int count = 0;
        while (l <= r) {
            count++;
            //如果可以挤上一个最轻的人，就挤上去
            if (people[l] + people[r] <= limit) {
                l++;
            }
            //每次坐一个最重的人
            r--;
        }
        return count;
    }
}
