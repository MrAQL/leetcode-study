package top.yousite.leetcode.bit;

public class GetSum {
    /**
     * 371. 两整数之和
     */
    //思路:位运算
    public int getSum(int a, int b) {
        int carray = a & b;     //进位
        a^=b;                   //位相加
        while (carray!=0){
            b=carray<<1;
            carray = a&b;
            a^=b;
        }
        return a;
    }
}
