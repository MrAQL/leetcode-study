package main.java.top.yousite.leetcode.twopoint.essay;

public class RemoveDuplicatesFromSortedArrayII {
    /**
     * 80. 删除排序数组中的重复项 II
     */
    /**
     *          i
     *          |
     *  1,  1,  1,  2,  2,  3
     *          |
     *         count
     */
    public int removeDuplicates(int[] nums) {
        //如果 nums[i]==nums[count-2]，i++;count 不动
        if (nums == null) return 0;
        if (nums.length <=2){return nums.length;};
        int count =2;   //带插入位，为符合条件的元素的下一位
        for (int i =2;i<nums.length;i++){
            if (nums[i]!=nums[count-2]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
