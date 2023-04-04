class Solution {
    public int partitionString(String s) {
        int count = 1;
        // abacaba
        //       +
        // set=ab
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.clear();
                count++;
            }
            set.add(s.charAt(i));
        }
        return count;
    }
}
