package java.top.yousite.leetcode.bit;

public class PowerOfTwo {
    /**
     * 231. 2的幂
     */
    public boolean isPowerOfTwo(int n) {
        //二的幂的特点是首位为1，其他位为0；(只有1个1)
        /*例: 2 10
              4 100
              8 1000
         */
        /*if(n<0) return false;   //卡用例-2147483648
        int count =0;
        while(n!=0){    //计算1的个数
            n= n&(n-1);
            count++;
        }
        if(count ==1) return true;  //只有1个1
        return false;*/

        /**
         优化:
         **/
        if(n<=0) return false;  //0不是
        return (n&(n-1))==0; //判断一次就好


    }
}
