package top.yousite.leetcode.array.esay;

public class MaxSubArray {
	/**
	 * 53. 最大子序和
	 */
	public int maxSubArray(int[] nums) {
        int sum= 0x80000000; //记录子数组最大值	       //int sum= Integer.MIN_VALUE;
        int current=0;		 //当子数组累计值，单子数组为负时，置0
        for(int i=0; i<nums.length; i++){
            current+=nums[i];
            if(current>sum){
                sum=current;
            }if(current<0){
                current = 0;
            }
        }
        return sum;
    }
	
	
	
	/**
	 * 分治法
	 */
}
