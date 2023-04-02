class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] answer = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int l = 0;
            int r = potions.length-1;
            //  0 1 2   {2}
            //  5 8 8               
            //    l  
            //  r
            //  m                      
            while (l <= r) {
                int midpoint = l + (r - l) / 2;
                long mid = (long) potions[midpoint] * spell;
                if (mid < success) {
                    l = midpoint + 1;
                } else {
                    r = midpoint - 1;
                }
            }
            
            answer[i] = potions.length - l;
        }
        return answer;
    }
}
