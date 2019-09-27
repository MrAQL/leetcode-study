package top.yousite.leetcode.DP.hard;

public class BestTimeToBuyAndSellStockIII {
    /**
     * 123. 买卖股票的最佳时机 III
     */
    //三维dp
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int dp[][][] = new int[prices.length][3][2];

        for (int i = 0; i < prices.length; i++) {
            for (int k = 2; k >= 1; k--) {
                if(i-1 <0){
                    dp[i][k][0] = 0;
                    dp[i][k][1] =-prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1],dp[i-1][k-1][0]-prices[i]);
            }
        }
        return dp[prices.length-1][2][0];

    }
}
