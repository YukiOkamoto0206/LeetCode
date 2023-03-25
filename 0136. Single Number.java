// set
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        return set.iterator().next();
    }
}

// bit manipulation
class Solution {
    public int singleNumber(int[] nums) {
        // [2, 2, 1]
        // 2: 10
        // 2: 10
        // 1: 01
        //sum 01

        // [4,1,2,1,2]
        // 4: 100
        // 1: 001
        // 2: 010
        // 1: 001
        // 2: 010
        //sum 100

        int ans = 0;
        for (int num: nums) {
            ans ^= num;
        }
        return ans;
    }
}
