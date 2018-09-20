package top.yousite.leetcode.array.esay;

public class twoSum_II {
	/**
	 * 167. 两数之和 II - 输入有序数组
	 */
	public int[] twoSum(int[] numbers, int target) {
        //与1. 两数之和（暴力算法）
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j] == target){
                    return new int[]  {i+1,j+1};
                }
            }
        }
         throw new IllegalArgumentException("参数错误");
    }
}
