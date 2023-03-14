class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while (l <= r) {
            int middle = (l+r)/2;
            if (target < nums[middle]) {
                r = middle - 1;
            } else if (target > nums[middle]) {
                l = middle + 1;
            } else {
                return middle;
            }
        }
        return l;
    }
}
