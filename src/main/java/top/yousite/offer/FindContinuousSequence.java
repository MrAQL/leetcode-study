package top.yousite.offer;

import java.util.ArrayList;

public class FindContinuousSequence {
    //和为S的连续正数序列 (滑动窗口、双指针)
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int l=1;
        int r=2;
        while (l<r){
            if (sum(l,r) < sum){
                r++;
            }else if(sum(l,r) > sum){
                l++;
            }else{
                ArrayList<Integer> row = new ArrayList<Integer>();
                for (int i = l; i <= r; i++) {
                    row.add(i);
                }
                l++;
                res.add(row);
            }
        }
        return res;

    }

    //求和
    private int sum(int left,int right){
        int n =right+1-left;
        return n*(left+right)/2;
    }
}
