// DFS
class Solution {
    int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    boolean[][] visited;
    int r;
    int c;
    int[][] grid;
    public int numEnclaves(int[][] g) {
        grid = g;
        r = grid.length;
        c = grid[0].length;
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1 && (i==0 || j==0 || i==r-1 || j==c-1)) dfs(i,j);
            }
        }

        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                count+=grid[i][j];
            }
        }
        return count;
    }
    void dfs(int i, int j) {
        if (i < 0 || i >= r || j < 0 || j >= c || visited[i][j] || grid[i][j] == 0) return;
        visited[i][j] = true;
        grid[i][j] = 0;
        for (int[] dir: directions) {
            int x = i + dir[0];
            int y = j + dir[1];
            dfs(x,y);
        }
    }
}

