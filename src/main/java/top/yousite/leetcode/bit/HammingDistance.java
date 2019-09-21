package top.yousite.leetcode.bit;

import java.util.*;

public class HammingDistance {
    /**
     * 461. 汉明距离
     */
    //异或后二进制 结果 1 的个数
    public int hammingDistance(int x, int y) {

        //法1:
        /*x^=y;
        int res= 0;
        while(x!=0){
            res++;
            x= x&(x-1);
        }
        return res;*/

        //法2:
        return Integer.bitCount(x^y);



    }
}
