package java.top.yousite.leetcode.DP.easy;

public class ClimbingStairs {
    /**
     * 70. 爬楼梯
     */
    public int climbStairs(int n) {
        //0-1
        //1-1
        if(n<2 && n>0) return 1;
        int f0=1;
        int f1=1;
        int res=0;
        for(int i =1;i<n;i++){
            res=f0+f1;
            f0=f1;
            f1=res;
        }
        return res;
    }
}
