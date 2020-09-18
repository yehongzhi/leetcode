class Solution {

    public int numRabbits(int[] answers) {
        int length = answers.length;
        if (length == 0) {
            return 0;
        }
        int res = 0;
        int max;
        int k;
        int star;
        Arrays.sort(answers);
        for (int i = 0; i < length; i++) {
            int ans = answers[i] + 1;
            max = answers[i] + 1;
            res += ans;
            k = answers[i];
            star = i;
            while (i < length && k == answers[i] && max > i - star) {
                i++;
            }
            i--;
        }
        return res;
    }
}
