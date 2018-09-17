package top.yousite.leetcode.array.esay;

public class MaxProfit_II {

	/**
	 * 	122. 买卖股票的最佳时机 II
	 */
	
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int max =0;     //利润
        for(int i =1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max+= prices[i]-prices[i-1];      //把利润相加起来
            }
        }
        return max;
    }
}
