class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while (l <= r) {
            int midIndex = l + (r - l) / 2;
            int mid = nums[midIndex];
            if (midIndex > 0 && mid < nums[midIndex-1]) {
                return mid;
            }
            if (nums[l] <= mid && mid <= nums[r]) break;
            if (nums[l] <= mid) {
                l = midIndex + 1;
            } else {
                r = midIndex - 1;
            }
        }
        return nums[l];
    }
}
