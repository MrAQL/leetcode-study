package main.java.top.yousite.leetcode.twopoint.essay;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArraysII {
    /**
     * 350. 两个数组的交集 II
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        //交集可重复
        List<Integer> list  = new ArrayList<>();
        List<Integer> resList  = new ArrayList<>();

        for (int num1 : nums1){
            list.add(num1);
        }
        for (int num2 : nums2){
            if (list.contains(num2)){
                resList.add(num2);
                list.remove((Object)num2);  //不加object的话是删除指定索引元素
            }
        }
        int[]resStr = new int[resList.size()];
        for (int i = 0 ;i<resStr.length;i++){
            resStr[i] = resList.get(i);
        }
        return resStr;

    }

}
