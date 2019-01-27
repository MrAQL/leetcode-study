package java.top.yousite.leetcode.DP.easy;

public class MinCostClimbingStairs {
    /**
     * 746. 使用最小花费爬楼梯
     */
    public int minCostClimbingStairs(int[] cost) {
        if(cost == null ||cost.length ==0) return 0;
        if (cost.length == 1) return cost[0];
        if(cost.length == 2) return Math.min(cost[0],cost[1]);
        int[] dp = new int[cost.length+1];  //dp[i]表示爬到第i层的最小花费
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[cost.length];
    }
}
