package top.yousite.leetcode.DP.hard;

public class BestTimeToBuyAndSellStockIV {
    /**
     * 188. 买卖股票的最佳时机 IV
     */
    //123基础上＋贪心，不然会爆内存
    public int maxProfit(int k, int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        if (k> prices.length/2){
            return greep(prices);
        }
        int dp[][][] = new int[prices.length][k+1][2];

        for (int i = 0; i < prices.length; i++) {
            for (int j = k; j >= 1; j--) {
                if(i-1 <0){
                    dp[i][j][0] = 0;
                    dp[i][j][1] =-prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[prices.length-1][k][0];
    }

    private int greep(int[] prices){
        int dp_i_0 = 0;
        int dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            dp_i_0 = Math.max(dp_i_0,dp_i_1+ prices[i]);
            dp_i_1 = Math.max(dp_i_1,dp_i_0 - prices[i]);

        }
        return dp_i_0;
    }
}
