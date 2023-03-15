class Solution {
    public String addBinary(String a, String b) {
        int diff = a.length() - b.length(); // 1
        if (diff > 0) {
            for (int i = 0; i < diff; i++) {
                b = "0"+b;
            }
        } else {
            for (int i = 0; i < Math.abs(diff); i++) {
                a = "0"+a;
            }
        }
        // 11, 01
        String answer = "";
        int count = 0;
        for (int i = a.length()-1; i >= 0; i--) {
            int int_a = a.charAt(i) - '0';
            int int_b = b.charAt(i) - '0';
            answer = (int_a + int_b + count) % 2 + answer;
            if (int_a + int_b + count > 1) {
                count = 1;
            } else {
                count = 0;
            }
        }
        if (count == 1) {
            answer = count + answer;
        }
        return answer;
    }
}
