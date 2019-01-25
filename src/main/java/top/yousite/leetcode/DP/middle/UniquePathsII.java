package java.top.yousite.leetcode.DP.middle;

public class UniquePathsII {
    /**
     * 63. 不同路径 II
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //比62增加多一个状态判断，判断obstacleGrid[i][j]是否为1
        if (obstacleGrid[0][0] == 1) return 0;
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0] = 1;
        //初始化第一行
        for (int i = 1; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] ==0 && dp[0][i-1] ==1){
                dp[0][i] = 1;}
            else{
                dp[0][i] = 0;}
        }
        //初始化第一列
        for (int i = 1; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] ==0 && dp[i-1][0] ==1){
                dp[i][0] = 1;}
            else{
                dp[i][0] = 0;}
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 0){
                    if (obstacleGrid[i-1][j] ==0){  //上一行不为1
                        dp[i][j]+=dp[i-1][j];
                    }
                    if (obstacleGrid[i][j-1] ==0){  //上一列不为1
                        dp[i][j]+=dp[i][j-1];
                    }
                }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
