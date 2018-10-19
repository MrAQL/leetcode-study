package main.java.top.yousite.leetcode.hash.essay;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    /**
     * 771. 宝石与石头
     */
    //solve-1: hash
    /*public int numJewelsInStones(String J, String S) {
        //字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头
        Map map =new HashMap();
        char[] chars = J.toCharArray();   //宝石的类型
        char[] stones = S.toCharArray();  //你拥有的石头
        int count =0;
        for (char jewl  : chars ){
            map.put(jewl,0);
        }
        for (int i =0 ;i<stones.length;i++){
            if (map.containsKey(stones[i])){
                count++;
            }
        }
        return  count;
    }*/

    /**
     *   solve-2: 2个循环(判断 石头 == 宝石？resCount++: ;)
     */
    public int numJewelsInStones(String J, String S){
        char [] Jewels = J.toCharArray();
        char [] Stones = S.toCharArray();
        int resCount = 0;
        for (char stone :Stones){
            for (char jewel :Jewels){
                if (stone == jewel){
                    resCount++;
                }
            }
        }
        return resCount;

    }
}
