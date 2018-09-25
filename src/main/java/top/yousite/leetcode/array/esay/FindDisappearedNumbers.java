package top.yousite.leetcode.array.esay;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
	/**
	 *  448. 找到所有数组中消失的数字
	 * 
	 */
	public List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> list = new ArrayList();
	        //设置访问过的索引位为负数
	        for(int i=0;i<nums.length;i++){
	            int index= Math.abs(nums[i])-1;
	            if(nums[index]>0){
	                nums[index] = -nums[index];
	            }  
	        }
	        for(int i =0 ;i<nums.length;i++){
	            if(nums[i]>0){
	                list.add(i+1);
	            }
	        }
	        return list;
	    }
}
