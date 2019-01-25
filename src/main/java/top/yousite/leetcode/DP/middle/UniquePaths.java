package java.top.yousite.leetcode.DP.middle;

public class UniquePaths {
    /**
     * 62. 不同路径
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        //第一行全部置1
        for (int i = 0; i < n; i++) {
            dp[0][i]=1;
        }
        //第一列全部置1
        for (int i = 0; i < m; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //到达[i-1][j]的路径个数+到[i][j-1]的路径个数
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
