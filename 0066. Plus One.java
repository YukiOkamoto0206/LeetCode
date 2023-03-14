import java.math.*;
class Solution {
    public int[] plusOne(int[] digits) {
        String s = "";
        for (int digit: digits) {
            s += digit;
        }
        BigInteger big = new BigInteger(s);
        big = big.add(new BigInteger("1"));
        s = big.toString();
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(i) - '0';
        }
        
        return answer;
    }
}
