package java.top.yousite.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    /**
     *216.组合总和 III
     */
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        //找出所有相加之和为 n 的 k 个数的组合。
        dfs(new ArrayList<>(),k,n,1);
        return res;
    }
    private void dfs(List<Integer> row,int k,int n ,int start){
        if (n<0 || k<0)return;
        if (n==0 && k==0){
            res.add(new ArrayList<>(row));
        }
        for (int i = start; i <= 9; i++) {
            row.add(i);
            dfs(row,k-1,n-i,i+1);
            row.remove(row.size()-1);   //回溯
        }
    }
}
