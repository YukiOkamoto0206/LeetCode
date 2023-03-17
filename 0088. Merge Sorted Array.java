class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 = [1,2,3,0,0,0]
        //              1     p
        // nums2 = [2,5,6]
        //              2  
        int p1 = m-1;
        int p2 = n-1;
        for (int i = n+m-1; i >= 0; i--) {
            if (p1 >= 0 && p2 >= 0) {
                nums1[i] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
            } else if (p1 >= 0) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }
    }
}
