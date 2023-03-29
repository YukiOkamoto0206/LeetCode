class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // piles = [3,6,7,11]
        // 1,2,3,4,5,6,7,8,9,10,11
        //         r           
        //         l 
        int max = 0;
        for (int pile: piles) {
            max = Math.max(pile, max);
        }
        int l = 1;
        int r = max;
        int min = Integer.MAX_VALUE;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sum = 0;
            for (int pile: piles) {
                sum += Math.ceil((double)pile/mid);
                if (sum > h) break;
            }
            if (sum <= h) {
                min = Math.min(min, mid);
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return min;
    }
}
