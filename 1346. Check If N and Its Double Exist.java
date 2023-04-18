class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int half = arr[i]%2 == 0 ? arr[i]/2 : 9999;
            if (set.contains(arr[i]*2) || set.contains(half)) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;
    }
}
