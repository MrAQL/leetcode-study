package top.yousite.leetcode.array.esay;

public class MaxProfit {
	/**
	 * 	121. 买卖股票的最佳时机
	 */
	
	public int maxProfit(int[] prices) {
	       //动态规划
	        int max = 0;    //利润
	        if(prices.length==0) return 0;
	        int min = prices[0];    //最少购入价
	        for(int i =0;i<prices.length;i++){
	            max=Math.max(max,prices[i]-min);
	            min=Math.min(min,prices[i]);
	        }
	        return max;
	    }
}
