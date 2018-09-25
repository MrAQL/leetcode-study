package top.yousite.leetcode.array.esay;

public class ContainsNearbyDuplicate {
	/**
	 * 219. 存在重复元素 II
	 */
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		//只要在K范围内 Math.abs(j-i)<=k ，满足题意 
		//题目有些误解。不是   ：Math.max( Math.abs(j-i) ) ==k？true:false; 
		boolean flag=false;
        for( int i =0; i<nums.length; i++){
            for(int j =i+1 ; j<nums.length ; j++){
                if(nums[i] == nums[j]){
                     if(Math.abs(j-i) <= k){
                       flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
