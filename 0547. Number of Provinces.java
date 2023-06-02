class Solution {
    public int findCircleNum(int[][] isConnected) {
        // set is good way to use visited instead of using array
        Set<Integer> visited = new HashSet<>();
        int ans = 0;
        // check all cities if they are visited or not.
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited.contains(i)) {
                ans++;
                // bfs for checking connected cities.
                bfs(i, visited, isConnected);
            }
        }
        return ans;
    }

    private void bfs(int start, Set visited, int[][] isConnected) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int index = q.poll();
            visited.add(index);
            // cur is current city
            int[] cur = isConnected[index];
            // checking connected cities of current city.
            for (int i = 0; i < cur.length; i++) {
                // if checking myself (i and index are same), always 1 so continue.
                if (i == index) continue;
                if (visited.contains(i)) continue;
                // only when value is 1, it is connected.
                if (cur[i] == 1) q.add(i);
            }
        }
    }
}
