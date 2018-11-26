package java.top.yousite.leetcode.bit;

public class PowerOfFour {
    /**
     * 342. 4的幂
     */
    public boolean isPowerOfFour(int num) {

        /**
         2 4 8  16  32 64
         %3   2 1 2   1  2   1
         (-1)&3    1 0 1   0  1   0

         **/
        //法一
        // 二的倍数 且 %3==1
        //return (num&(num-1)) == 0 && (num ==1||num%3 ==1);

        //法二:判断1是否在奇数位上
        /**
         100     4           10000       8
         &                    &
         0101  0x0..05      10101010   0x0.0055
         ||                  ||
         100                10000

         **/
        //二的倍数 且 判断1是否在奇数位上
        return (num&(num-1)) == 0 && ((num&0x55555555)!=0);


    }
}
