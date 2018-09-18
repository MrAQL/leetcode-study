package top.yousite.leetcode.array.esay;

public class MoveZeroes {
	/**
	 * 283. 移动零
	 */
	public void moveZeroes(int[] nums) {
        //先将非0数移到首部，尾部补零
        int j = 0;
        int size = nums.length;
        for(int i =0 ; i<size; i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for(int k = j ;k < size; k++){
            nums[k]=0;
        }
    }
}
