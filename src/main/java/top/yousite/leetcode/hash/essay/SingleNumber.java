package main.java.top.yousite.leetcode.hash.essay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumber {
    /**
     * 136. 只出现一次的数字
     *  (除了某个元素只出现一次以外，其余每个元素均出现两次)
     */

    /**
     * solve-1.哈希表
     *         key:nums[i]
     *         value:count
     *
     * 然后遍历找出value = 1的
     *
     * solve-2. 位运算
     *        异或(^)：同为假，异为真
     *
     */
    // time :O(n), space:O(n)
    /*public int singleNumber(int[] nums) {
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
    }*/

    //solve-2:异或(^) (只有1个元素出现1次，其余都是出现2次，所以2次的元素异或完就只剩下1次的元素)
    public int singleNumber(int[] nums) {
        //异或(^)：同为假，异为真
        int temp = 0;  //任何数异或0后，都等于本身（由异或定义得）
        for(int i :nums){
            temp^=i;
        }
        return temp;

    }
}
