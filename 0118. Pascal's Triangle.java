class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        answer.add(prev);
        while (answer.size() < numRows) {
            prev = answer.get(answer.size()-1);
            List<Integer> cur = new ArrayList<>();
            cur.add(0);
            cur.addAll(prev);
            for (int j = 0; j < prev.size(); j++) {
                cur.set(j, prev.get(j)+cur.get(j));
            }
            answer.add(cur);
        }
        return answer;
    }
}
