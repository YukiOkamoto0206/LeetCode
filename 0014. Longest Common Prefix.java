class Solution {
    public String longestCommonPrefix(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String str: strs) {
            for (int i = 0; i < str.length()+1; i++) {
                String s = str.substring(0, i);
                map.put(s, map.getOrDefault(s, 0)+1);
            }
        }
        String answer = "";
        for (Map.Entry<String, Integer> set: map.entrySet()) {
            if (strs.length == set.getValue() && answer.length() < set.getKey().length()) {
                answer = set.getKey();
            }
        }

        return answer;
    }
}
