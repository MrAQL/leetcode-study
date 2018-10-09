package top.yousite.leetcode.array.middle;

public class MaxArea {
	/**
	 * 11. 盛最多水的容器
	 * 
	 * 	双指针法，比较两指针，小的移动
	 */
	public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int water = 0;
        while(left != right){
            water=Math.max(water,Math.min(height[left],height[right]) * (right-left));
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return water;
                           
         
    }

}
