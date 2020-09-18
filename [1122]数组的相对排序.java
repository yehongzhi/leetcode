class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        for (int i : arr2) {
            max = Math.max(i, max);
        }
        List<Integer>[] lists = new List[max + 1];
        int[] arr3 = null;
        for (int value : arr1) {
            //如果包含在arr2中
            if (contain(arr2, value)) {
                List<Integer> list = lists[value];
                if (list == null) {
                    lists[value] = new ArrayList<>();
                }
                lists[value].add(value);
            } else {
                arr3 = insertSort(arr3, value);
            }
        }
        int index = 0;
        for (int i : arr2) {
            for (Integer num : lists[i]) {
                arr1[index++] = num;
            }
        }
        if (arr3 != null) {
            for (Integer num : arr3) {
                arr1[index++] = num;
            }
        }
        return arr1;
    }

    private int[] insertSort(int[] nums, int num) {
        if (nums == null || nums.length == 0) {
            return new int[]{num};
        }
        int[] temp = new int[nums.length + 1];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        int i;
        for (i = temp.length - 2; i >= 0 && temp[i] > num; i--) {
            temp[i + 1] = temp[i];
        }
        temp[i + 1] = num;
        return temp;
    }

    private boolean contain(int[] arr, int num) {
        boolean[] booleans = new boolean[1000 + 1];
        for (int i : arr) {
            booleans[i] = true;
        }
        return booleans[num];
    }
}
