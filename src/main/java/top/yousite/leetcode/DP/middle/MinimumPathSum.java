package java.top.yousite.leetcode.DP.middle;

public class MinimumPathSum {
    /**
     * 64. 最小路径和
     */
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        //只能走第一行
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }
        //只能走第一列
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] =dp[i-1][0]+grid[i][0];
        }
        //从1,1开始(第二行，第二列开始)
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                //i，j的上一步的2种走法，取最小的那个
                dp[i][j] = grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
