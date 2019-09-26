package top.yousite.leetcode.DP.middle;

public class BestTimeToBuyAndSellStockWithTransactionFee {
    /**
     * 714. 买卖股票的最佳时机含手续费
     */
    //dp:只有前后状态有关（保留前后状态即可），只有买才需要手续费
    public int maxProfit(int[] prices, int fee) {
        int dp_i_0=0;
        int dp_i_1=Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int temp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0,dp_i_1+prices[i]);
            dp_i_1 = Math.max(dp_i_1,temp-prices[i]-fee);
        }
        return dp_i_0;
    }
}
