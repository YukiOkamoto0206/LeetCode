class Solution {
    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        while (l <= r) {
            long m = l + (r - l) / 2;
            if (m*m > x) {
                r = m - 1;
            } else if (m*m < x) {
                l = m + 1;
            } else {
                return (int)m;
            }
        }
        return (int)l-1;
    }
}
