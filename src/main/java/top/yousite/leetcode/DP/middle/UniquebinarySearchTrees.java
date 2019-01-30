package java.top.yousite.leetcode.DP.middle;

public class UniquebinarySearchTrees {
    /**
     * 96. 不同的二叉搜索树
     */
    public int numTrees(int n) {
        if(n==0 ||n == 1) return 1;
        int[] dp = new int[n+1];
        dp[0]=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j]* dp[i-j-1];   //左子树的种类 * 右子树的种类
            }
        }
        return dp[n];
    }
}
