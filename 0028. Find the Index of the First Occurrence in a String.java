class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        // haystack = "sadbutsad"9, needle = "sad"3

        for (int i = 0; i <= haystack.length()-len; i++) {
            boolean isMatch = true;
            for (int j = 0; j < len; j++) {
                if (haystack.charAt(j+i) != needle.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                return i;
            }
        }
        return -1;
    }
}
