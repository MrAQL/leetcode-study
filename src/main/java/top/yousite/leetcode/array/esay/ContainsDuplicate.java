package top.yousite.leetcode.array.esay;

import java.util.Arrays;

public class ContainsDuplicate {
	/**
	 * 217. 存在重复元素
	 */

//	做法一:暴力算法（超时）
//	public boolean containsDuplicate(int[] nums) {
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i] == nums[j]) return true;
//            }
//        }
//        return false;
//    }
	

//  做法二:对数组进行排序，然后比较 第i位 与 第i+1位 。看是否相同
	public boolean containsDuplicate(int[] nums) {
        if(nums.length<=1) return false;
        //数组排序
        Arrays.sort(nums);
        for(int i=0 ; i <nums.length-1 ; i++){
            if(nums[i]==nums[i+1]) {
                return true;}
        }
        return false;
    }
	
}
