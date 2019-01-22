package java.top.yousite.leetcode.DP.easy;

import java.awt.font.NumericShaper;

public class HouseRobber {
    /**
     * 198. 打家劫舍
     */
    public int rob(int[] nums) {
        if (nums == null ||nums.length ==0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0],nums[1]);
        int[] dp= new int[nums.length];
        dp[0]=nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            //选第i个的话，同时选dp[i-2], 或者不选第i个,选dp[i-1]； 2个取最大的一个(0-1规划)
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
