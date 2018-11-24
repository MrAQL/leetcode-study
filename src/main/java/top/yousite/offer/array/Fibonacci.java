package java.top.yousite.offer.array;

public class Fibonacci {
    /**
     * 斐波那契数列
     */
    public int Fibonacci(int n) {
        //递归
        /*if(n == 0) return 0;
        if(n==1) return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);*/

        //非递归
        int p1 = 0;
        int p2 = 1;
        if(n == 1) return 1;
        if(n == 2) return 1;
        int res =0;
        for(int i =2;i<=n;i++){
            res = p1+p2;
            p1=p2;
            p2=res;
        }
        return res;
    }
}
