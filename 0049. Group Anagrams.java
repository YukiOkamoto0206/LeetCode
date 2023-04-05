class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            char[] alph = new char[26];
            for (char c: str.toCharArray()) {
                alph[c - 'a']++;
            }
            String key = String.valueOf(alph);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}
