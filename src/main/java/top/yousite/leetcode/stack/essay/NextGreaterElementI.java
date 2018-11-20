package java.top.yousite.leetcode.stack.essay;

import java.util.*;

public class NextGreaterElementI {
    /**
     * 496. 下一个更大元素 I
     */
    /**
       输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
       输出: [-1,3,-1]
     **/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //hash
        /*Map<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i],i);   //value,index
        }
        int k=0;
        for(int i =0;i<nums1.length;i++){
            int index= map2.get(nums1[i]); //获取index
            int maxIndex = -1;
            while(++index<nums2.length){
                if(nums2[index] >nums1[i]){
                    maxIndex = index;
                    break;
                }
            }
            if(maxIndex == -1){
                nums1[i] = maxIndex;}
            else{
                nums1[i] = nums2[maxIndex];
            }
        }
        return nums1;*/

        //stack
        Map<Integer,Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        for (int num :nums2){
            while (!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }


        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }

}
