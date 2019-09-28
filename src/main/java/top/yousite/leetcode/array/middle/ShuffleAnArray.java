package top.yousite.leetcode.array.middle;

import java.util.Random;

public class ShuffleAnArray {
    /**
     * 384. 打乱数组
     */
    //循环一遍，随机交换数组位置
    class Solution {
        int [] oldNums;
        int [] sfNums;
        public Solution(int[] nums) {
            oldNums = new int[nums.length];
            sfNums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                oldNums[i] =nums[i];
                sfNums[i] =nums[i];
            }
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return oldNums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            int[] res = sfNums;
            for (int i = 0; i < sfNums.length; i++) {
                int temp =  res[i];
                int random = new Random().nextInt(res.length);
                res[i]=res[random];
                res[random]=temp;
            }
            return res;
        }
    }
}
