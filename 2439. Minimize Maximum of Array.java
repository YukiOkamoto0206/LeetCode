class Solution {
    public int minimizeArrayValue(int[] nums) {
        long prefix = 0;
        long answer = 0;
        // 13,13,20,0,8,9,9
        // 13,13
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            answer = (long) Math.max(answer, Math.ceil(prefix/(double)(i+1)));
        }
        return (int) answer;
    }
}
