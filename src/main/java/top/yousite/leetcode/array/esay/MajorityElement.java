package top.yousite.leetcode.array.esay;

public class MajorityElement {
	/**
	 * 169. 求众数
	 */
	public int majorityElement(int[] nums) {
        //因为大于 ⌊ n/2 ⌋  故:升序 或 减序求中间数 
        //冒泡法
        for(int i=0 ;i<nums.length;i++){
           for(int j =i;j<nums.length;j++){
               if(nums[i]<nums[j]){
                   int temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
           }
       }
        return nums[nums.length/2];
    }
}
