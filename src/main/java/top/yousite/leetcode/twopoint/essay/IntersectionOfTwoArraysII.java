package main.java.top.yousite.leetcode.twopoint.essay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    /**
     * 350. 两个数组的交集 II
     *       (交集可重复)
     */
    /**
     * solve-1:
     *          (看源码)
     * solve-2:
     *          给两个数组排序，然后用两个索引分别代表两个数组的起始位置，如果两个索引所代表的数字相等，
     *          则将数字存入结果中，两个索引均自增1，如果第一个索引所代表的数字大，则第二个索引自增1，反之亦然。
     */
    /*public int[] intersect(int[] nums1, int[] nums2) {

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

    }*/

    /**
     * solve-2
     *
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length ==0 ||nums1 == null){return nums1;};
        if (nums2.length ==0 ||nums2 == null){return nums2;};

        //sort
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int num1Point = 0;
        int num2Point = 0;

        List<Integer> resList = new ArrayList<>();
        while (num1Point <nums1.length && num2Point <nums2.length){
            if (nums1[num1Point] == nums2[num2Point] ){
                resList.add(nums1[num1Point]);
                num1Point++;
                num2Point++;
            }
            else if (nums1[num1Point] > nums2[num2Point] ){
                num2Point++;
            }
            else{
                num1Point++;
            }
        }
        int[] resStr = new int[resList.size()];
        for (int i =0 ;i<resStr.length;i++){
            resStr[i] = resList.get(i);
        }
        return resStr;
    }

}
