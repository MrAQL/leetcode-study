package java.top.yousite.offer.array;

public class JumpFloorII {
    /**
     * 变态跳台阶
     */

    /**
     * 思路:
     *      （第几格跳上来的方案）
     *  f(1)=1
     *  f(2)=f(1)+1
     *  ...
     *  f(n)=f(1)+f(2)+...+f(n-2)+f(n-1)+1     (1)
     *  f(n-1)=f(1)+f(2)+...+f(n-2)+1           (2)
     *
     *  (1)-(2) = f(n)=2*f(n-1)
     *                     a1=1;q=2的等比数列；通项公式为:n=2^(n-1)
     *
     *
     */
    public int JumpFloorII(int target) {

        //递归
        /*
        if(target == 1) return 1;
        return 2*JumpFloorII(target-1);*/

        //非递归
        int res =1;
        for(int i =1;i<target;i++){
            res*=2;
        }
        return res;
    }
}
