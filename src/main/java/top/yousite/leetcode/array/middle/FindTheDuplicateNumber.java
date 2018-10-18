package main.java.top.yousite.leetcode.array.middle;

public class FindTheDuplicateNumber {
    /**
     * 287. 寻找重复数
     */

    /**
     * 二分法
     */
    public int findDuplicate(int[] nums) {
        //遍历比较中间，如果小于中间节点的个数小于中间位置，则在右边，以此类推
        if (nums ==null || nums.length==0){return -1;}
        int low =1;
        int hight = nums.length-1;
        while (low<=hight){
            int count = 0;
            int mid = (low+hight)/2;
            for (int arg : nums){
                if (arg<=mid){count++;}
            }
            if (count>mid){ hight =mid-1;}
            else {
                low = mid+1;
            }

        }
        return  low;
    }


    /**
     * 与单链表找是否有环一样，把数组看成链表()
     */
   /* public int findDuplicate(int[] nums) {
        int low = nums[0];
        int fast = nums[nums[low]];
        while (low != fast){
            low = nums[low];
            fast = nums[nums[fast]];
        }
        return low;


    }*/

}
