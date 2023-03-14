class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0]-1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (cur > prev) {
                nums[count] = cur;
                count++;
            }
            prev = cur;
        }
        return count;
    }
}
