class Solution {
    public int[] evenOddBit(int n) {
        int index = 0;
        int even = 0;
        int odd = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                if (index % 2 == 0) even++;
                else odd++;
            }
            n /= 2;
            index++;
        }
        return new int[]{even, odd};
    }
}
