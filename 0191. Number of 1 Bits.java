// 11111111111111111111111111111101
// 00000000000000000000000000000010
// n = -3 -> 2
// |-3+1| = 2
// n << 1


public class Solution {
    public int hammingWeight(int n) {
        return n >= 0 ? checker(n) : 32-checker(Math.abs(n+1)); 
        // return n >= 0 ? checker(n) : 32-checker(~n);
    }
    private int checker(int n) {
        int count = 0;
        while (n>0) {
            count += n%2;
            n /= 2;
        }
        return count;
    }
}
