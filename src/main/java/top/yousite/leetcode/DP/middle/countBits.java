package java.top.yousite.leetcode.DP.middle;

public class countBits {
    /**
     * 338. 比特位计数
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        /**
         * a(n) = 0         n=0
         * a(n) = a(n/2)    n=偶数
         * a(n) = a(n-1)+1    n=奇数
         */
        int[] res = new int[num+1];
        res[0] =0;
        for (int i = 1; i <= num; i++) {
            //奇数
            if (i%2 !=0){
                res[i]=res[i-1]+1;
            }else {
                res[i]=res[i/2];
            }
        }
        return res;

    }
}
