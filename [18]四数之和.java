class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        if (length < 4) {
            return res;
        }
        Arrays.sort(nums);
        int i, k, h, j;
        for (i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int min = nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
            if (min > target) {
                break;
            }
            int max = nums[i] + nums[length - 1] + nums[length - 2] + nums[length - 3];
            if (max < target) {
                continue;
            }
            for (k = i + 1; k < length - 2; k++) {
                if (k > i + 1 && nums[k] == nums[k - 1]) {
                    continue;
                }
                h = k + 1;
                j = length - 1;
                int min1 = nums[i] + nums[k] + nums[h] + nums[h + 1];
                if (min1 > target) {
                    break;
                }
                int max1 = nums[i] + nums[k] + nums[j] + nums[j - 1];
                if (max1 < target) {
                    continue;
                }
                while (h < j) {
                    int curr = nums[i] + nums[k] + nums[h] + nums[j];
                    if (curr == target) {
                        res.add(Arrays.asList(nums[i], nums[k], nums[h], nums[j]));
                        h++;
                        while (h < j && nums[h] == nums[h - 1]) {
                            h++;
                        }
                        j--;
                        while (h < j && k < j && nums[j] == nums[j + 1]) {
                            j--;
                        }
                    } else if (curr < target) {
                        h++;
                    } else {
                        j--;
                    }
                }
            }
        }
        return res;
    }
}
