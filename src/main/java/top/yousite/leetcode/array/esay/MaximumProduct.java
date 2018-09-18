package top.yousite.leetcode.array.esay;

import java.util.Arrays;

public class MaximumProduct {
	/**
	 * 628. 三个数的最大乘积
	 */
	
	//报错（无考虑负数）
//	public int maximumProduct(int[] nums) {  //要考虑 正负数
//        Arrays.sort(nums);
//        int count =0;
//        int s=1;
//        for(int i=nums.length-1; i>0;i--){
//            s*=nums[i];
//            count++;
//            if(count == 3){
//                break;
//            }
//        }
//        return s;}
	
	public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length-1;
        //(全正) 或 (全负) 或 (2正一负)
        int sum = nums[size] * nums[size-1] * nums[size-2];
        //(2负一真)
        int sum2 = nums[0] * nums[1] * nums[size];
        if(sum2>sum){
            return sum2;
        }
        return sum;
        
    }
	
}
