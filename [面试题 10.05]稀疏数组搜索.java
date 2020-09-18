class Solution {
    public int findString(String[] words, String s) {
        int left = 0;
        while (left < words.length - 1 && "".equals(words[left])) {
            left++;
        }
        int right = words.length - 1;
        while (right >= 0 && "".equals(words[right])) {
            right--;
        }
        while (left < right) {
            int mid = (left + right) >>> 1;
            String word = words[mid];
            while ("".equals(word)) {
                mid--;
                word = words[mid];
            }
            if (word.equals(s)) {
                return mid;
            } else if (compareString(word, s)) {
                right = mid;
                while (right >= 0 && "".equals(words[right])) {
                    right--;
                }
            } else {
                left = mid + 1;
                while (left < words.length - 1 && "".equals(words[left])) {
                    left++;
                }
            }
        }
        return left == right && words[left].equals(s) ? left : -1;
    }


    private boolean compareString(String sou, String target) {
        return sou.compareTo(target) > 0;
    }
}
