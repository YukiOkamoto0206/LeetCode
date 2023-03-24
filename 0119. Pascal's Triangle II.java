class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        while (prev.size()-1 < rowIndex) {
            List<Integer> cur = new ArrayList<>();
            cur.add(0);
            cur.addAll(prev);
            prev.add(0);
            for (int i = 0; i < prev.size(); i++) {
                cur.set(i, prev.get(i)+cur.get(i));
            }
            prev = cur;
        }
        return prev;
    }
}
