class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            int mod = num % value;
            while (mod < 0) mod += value;
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
          int check = i % value;
          if (!map.containsKey(check) || map.get(check) == 0) return i;
          map.put(check, map.get(check)-1);
        }        

        return nums.length;
    }
}
