class Solution {
    public int mySqrt(int x) {
        if (x == 1) return 1;
        for (long i = 1; i <= x; i++) {
            if (i*i > x) {
                return (int)i-1;
            }
        }
        return 0;
    }
}
