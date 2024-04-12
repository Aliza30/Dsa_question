class Solution {
    public int uniquePaths(int m, int n) {
         int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int num = countPaths(0, 0, m, n, dp);
        if (m == 1 && n == 1)
            return num;
        return dp[0][0];
    }
    public int countPaths(int i, int j, int n, int m, int[][] dp) {
        if (i == (n - 1) && j == (m - 1)) return 1;
        if (i >= n || j >= m) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        else return dp[i][j] = countPaths(i + 1, j, n, m, dp) + countPaths(i, j + 1, n, m, dp);
    }
}