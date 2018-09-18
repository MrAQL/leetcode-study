package top.yousite.leetcode.array.esay;

import java.util.Arrays;
	/**
	 * 268. 缺失数字
	 * @author jam
	 *
	 */
	public class MissingNumber {
		 public int missingNumber(int[] nums) {
		        Arrays.sort(nums);
		        for(int i =0 ; i<nums.length; i++){
		            if(i != nums[i]){
		                return i;
		            }
		        }
		        return nums[nums.length-1]+1; //例:[0,1] 返回 2
		    }								  //例:[ 0 ] 返回 1
	}
