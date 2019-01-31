package java.top.yousite.leetcode.DP.easy;

public class RangeSumQueryImmutable {
    /**
     * 303. 区域和检索 - 数组不可变
     */
    int[] dp;   //前n个的和
    public NumArray(int[] nums) {
        if (nums== null ||nums.length==0) return ;
        dp = new int[nums.length+1];
        dp[0] =nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if(i==0){
            return dp[j];
        }else{
            return dp[j]-dp[i-1];   //（前j个的和） - （前i-1个的和）
        }
    }
}
