
class Solution {
    public String addBinary(String a, String b) {
        int base = 2;
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        // Input: a = "11", b = "1"
        a = reverseString(a);
        b = reverseString(b);

        while (b.length() < a.length()) {
            b += "0";
        }

        // 11, 01
        StringBuilder answer = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < a.length(); i++) {
            int sum = a.charAt(i) - '0' + b.charAt(i) - '0' + carry;
            answer.append(sum % base);
            carry = sum / base;
        }
        if (carry > 0) {
            answer.append(carry);
        }

        answer.reverse();
        return answer.toString();
    }

    private String reverseString(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
