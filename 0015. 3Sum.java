class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // -2,0,1,1,2
        //  p   l r             
        //             
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length-2; i++) {
            int target = 0 - nums[i];
            int left = i+1;
            int right = nums.length-1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (target == sum) {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    if (!set.contains(list)) {
                        answer.add(list);
                        set.add(list);
                    } 
                    left++;
                    right--;
                } else if (target < sum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return answer;
    }
}
