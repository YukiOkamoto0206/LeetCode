class BetterSolution {
    public int findMin(int[] nums) {
      // 3,4,5,1,2
      //       l 
      //       m   
      //     r  

      // 4,5,6,7,0,1,2
      //         l m r
      //         r   
      //             

      // 3,1,2
      //   l     
      // m r           
      //              
      int l = 0, r = nums.length-1;
      while (l < r) {
        int m = l + (r - l) / 2;
        if (nums[r] < nums[m]) {
          l = m + 1;
        } else {
          r = m;
        }
      }
      return nums[l];
    }
}



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
