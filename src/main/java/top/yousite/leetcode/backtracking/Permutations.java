package java.top.yousite.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    /**
     * 46.全排列
     */
        /**
         * 输入: [1,2,3]
         * 输出:
         * [
         *   [1,2,3],
         *   [1,3,2],
         *   [2,1,3],
         *   [2,3,1],
         *   [3,1,2],
         *   [3,2,1]
         * ]
         *
         */
    public List<List<Integer>> permute(int[] nums) {
        //回溯
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res,nums,0,nums.length-1);
        return res;

    }
    private void backtracking(List<List<Integer>> res,int[]nums,int p,int q){
        if (p==q){
            List list = new ArrayList();
            for (int i = 0; i <= q; i++) {
                list.add(nums[i]);
            }
            res.add(list);

        }
        for (int i = p; i <= q; i++) {  //q为nums长度
            //每个元素放在在头元素，然后全排类之后的元素
            swap(nums,p,i);
            backtracking(res,nums,p+1,q);
            swap(nums,p,i); //换回来
        }
    }

    private void swap(int[] nums, int p, int q) {
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q]=temp;
    }
}
