package java.top.yousite.leetcode.DP.easy;

public class Submissions {
    /**
     * 509. 斐波那契数
     */
    //动态规划
    public int fib(int N) {
        if(N<0) return -1;
        if(N==0) return 0;
        if(N==1) return 1;
        int p1 =0;
        int p2 = 1;
        for(int i=1;i<N;i++){
            int temp = p2;
            p2+=p1;
            p1=temp;
        }
        return p2;
    }
}
