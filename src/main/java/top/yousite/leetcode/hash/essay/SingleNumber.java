package main.java.top.yousite.leetcode.hash.essay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumber {
    /**
     * 136. 只出现一次的数字
     *
     */

    /**
     * 哈希表
     *      key:nums[i]
     *      value:count
     *
     * 然后遍历找出value = 1的
     *
     */
    // time :O(n), space:O(n)
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> ResMap = new HashMap<>();
        for (int i :nums){
            if (!ResMap.containsKey(i)){
                ResMap.put(i,1);
            }else {ResMap.put(i,2);}
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = ResMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry= iterator.next();
            if ( (int)entry.getValue() == 1){
                return (int)entry.getKey();
            }
        }
        return -1;
    }
}
