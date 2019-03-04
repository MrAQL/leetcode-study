package java.top.yousite.leetcode.array.esay;

import java.util.Arrays;

public class MergeSortedArray {
    /**
     * 88. 合并两个有序数组
     */
    /**
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //从后往前操作（法1）
        int index = m-- + n-- -1;
        while (m>=0 && n>=0){
            nums1[index--] = nums1[m]>nums2[n]?nums1[m--]:nums2[n--];
        }
        /**
         * [4,5,6,0,0,0]
         * 3
         * [1,2,3]
         * 3
         *
         * 出现 [4,5,6,4,5,6]
         */
        //把p2指针弄n --> -1
        while (n>=0){
            nums1[index--] = nums2[n--];
        }





        //插入到nus1后再排序（法2）
        /*int p1 =0;
        int p2 =0;
        while (p1<m && p2 <n){
            if (nums1[p1] <=nums2[p2]){
                p1++;
            }
            else if(nums1[p1]>nums2[p2]){
                int temp = nums2[p2];
                nums2[p2] = nums1[p1];
                nums1[p1] = temp;
            }
        }
        //nums2补到nums1后面
        for (int i = 0; i < n; i++) {
            nums1[p1++]= nums2[i];
        }
        Arrays.sort(nums1);*/
                
    }
}
