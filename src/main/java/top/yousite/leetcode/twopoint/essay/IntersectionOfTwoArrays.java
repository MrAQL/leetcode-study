package main.java.top.yousite.leetcode.twopoint.essay;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {
    /**
     * 349. 两个数组的交集
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();
        for (int i =0 ; i<nums1.length;i++){
            num.add(nums1[i]);
        }
        for(int i = 0 ;i<nums2.length;i++){
            if (num.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }

        int[]resStr = new int[result.size()];

        Iterator it = result.iterator();
        int index = 0;
        while (it.hasNext()){
            resStr[index++] = (int)it.next();
        }
        return resStr;

    }

}
