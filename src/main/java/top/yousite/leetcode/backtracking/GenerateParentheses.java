package java.top.yousite.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    /**
     *22. 括号生成
     */
    public List<String> generateParenthesis(int n) {
        List<String> resList = new ArrayList<>();
        dfs(resList,"",n,n);
        return resList;

    }

    public void dfs(List resList,String s,int left,int right){
        if (right<left)return;
        if (left==0 &&right ==0){
            resList.add(s);
        }
        if (left > 0){
            dfs(resList,s+"(",left-1,right);
        }
        if (right > 0){
            dfs(resList,s+")",left,right-1);
        }
    };

}
