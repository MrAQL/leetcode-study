package main.java.top.yousite.leetcode.twopoint.middle;

public class SortColors {
    /**
     * 75. 颜色分类
     */
    //思路:从头开始遍历原数组，如果遇到0，则交换该值和red指针指向的值，并将red指针后移一位。若遇到2，则交换该值和b
    /*public void sortColors(int[] nums) {
        int low =0;
        int hight = nums.length-1;
        int index = 0;
        while (index<=hight){
            if (nums[index] ==2){
                int temp = nums[hight];
                nums[hight] = nums[index];
                nums[index]=temp;
                hight--;

            }else if (nums[index] ==0){
                int temp = nums[low];
                nums[low] = nums[index];
                nums[index]=temp;
                low++;
                index++;

            }else {index++;}
        }
    }*/

    //优化代码，增加可读性
    public void sortColors(int[] nums) {
        //排序
        //从头开始遍历原数组，如果遇到0，则交换该值和red指针指向的值，并将red指针后移一位。若遇到2，则交换该值和blue指针指向的值，并将blue指针前移一位。若遇到1，则继续遍历。
        int begin = 0;
        int end = nums.length-1;
        int i=0;
        while(i<=end){
            if (nums[i] ==0){
                swap(nums,begin++,i++);
                /*i++;
                begin++;*/
            }
            else if (nums[i] ==2){
                swap(nums,end--,i); //i没有++的原因是有可能 nums[i] = 2 ,nums[end]也是为2，2个一交换就错了
                //end--;

            }else{
                i++;
            }

        }

    }

    public void swap(int []nums,int swap_Index_1,int swap_Index_2){
        int temp  = nums[swap_Index_1];
        nums[swap_Index_1] = nums[swap_Index_2];
        nums[swap_Index_2] = temp;
    }

}


