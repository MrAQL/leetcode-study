package java.top.yousite.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    /**
     * 78.子集
     */
    /**
     * 输入: nums = [1,2,3]
     * 输出:
     * [
     *   [3],
     *   [1],
     *   [2],
     *   [1,2,3],
     *   [1,3],
     *   [2,3],
     *   [1,2],
     *   []
     * ]
     */
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        //回溯
        dfs(new ArrayList<>(),nums,0);
        return res;
    }
    private void dfs(List<Integer> row ,int[]nums,int start){
        res.add(new ArrayList<>(row));
        for (int i = start;i<nums.length;i++){
            row.add(nums[i]);
            dfs(row,nums,i+1);
            row.remove(row.size()-1);
        }

    }
}
