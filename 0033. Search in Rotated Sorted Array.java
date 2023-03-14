class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        //          l 
        //          m 
        //          r
        // [4,5,6,7,0,1,2]
        while (l < r) {
            int middle = l + (r-l)/2;
            if (nums[middle] > nums[r]) {
                l = middle + 1;
            }  else {
                r = middle;
            }
        }

        int start = l;
        l = 0;
        r = nums.length-1;

        if (target >= nums[start] && target <= nums[r]) {
            l = start;
        } else {
            r = start-1;
        }


        while (l <= r) {
            int middle = l + (r-l)/2;
            if (nums[middle] > target) {
                r = middle - 1;
            } else if (nums[middle] < target) {
                l = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
