class Solution {
    public int maxArea(int[] height) {
        // 1,8,6,2,5,4,8,3,7
        //   l         r
        int l = 0;
        int r = height.length-1;
        int answer = 0;
        while (l < r) {
            answer = Math.max(answer, (r-l)*Math.min(height[l],height[r]));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return answer;
    }
}
