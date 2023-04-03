class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        // 1,2,2,3
        //   r
        //.  l
        int l = 0;
        int r = people.length - 1;
        while (l <= r) {
            count++;
            if (people[l] + people[r] <= limit) {
                l++;
            }
            r--;
        }
        return count;
    }
}
