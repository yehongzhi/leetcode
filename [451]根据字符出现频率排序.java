class Solution {

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character>[] lists = new List[s.length() + 1];
        Integer index;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            index = entry.getValue();
            if (lists[index] == null) {
                lists[index] = new ArrayList<>();
            }
            lists[index].add(entry.getKey());
        }
        StringBuilder sb = new StringBuilder();
        List<Character> list;
        for (int i = lists.length - 1; i >= 0; i--) {
            if (lists[i] == null) {
                continue;
            }
            list = lists[i];
            for (Character character : list) {
                int k = i;
                while (k > 0) {
                    sb.append(character);
                    k--;
                }
            }
        }
        return sb.toString();
    }
}
