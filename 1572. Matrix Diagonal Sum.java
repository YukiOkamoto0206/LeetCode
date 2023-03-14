class Solution {
    public int diagonalSum(int[][] mat) {
        int answer = 0;
        for (int i = 0; i < mat.length; i++) {
            answer += mat[i][i]; // 1, 5, 9
            answer += mat[mat.length-1-i][i]; // 7, 5, 3
        }
        if (mat.length%2 != 0) {
            answer -= mat[mat.length/2][mat.length/2];
        }
        return answer;
    }
}
