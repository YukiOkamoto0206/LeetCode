class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        int knight = 0;
        int i = 0;
        int j = 0;
        while (true) {
            int[][] dirs = {{1,2},{2,1},{-1,2},{2,-1},{-2,1},{1,-2},{-2,-1},{-1,-2}};
            boolean isPass = false;
            for (int[] dir: dirs) {
                int x = i+dir[0];
                int y = j+dir[1];
                if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == knight+1) {
                    knight++;
                    i = x;
                    j = y;
                    if (knight == n*n-1) return true;
                    isPass = true;
                    break;
                }
            }
            if (!isPass) return false;
        }
    }
}
