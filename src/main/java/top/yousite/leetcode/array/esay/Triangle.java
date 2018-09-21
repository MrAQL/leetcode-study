package top.yousite.leetcode.array.esay;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	/**
	 * 118. 杨辉三角
	 */
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> AllList = new ArrayList<List<Integer>>();
        for(int i =0 ;i<numRows; i++){
            List<Integer> row =  new ArrayList<Integer>();
            for(int j =0;j<=i;j++){
                if(j==0 || j==i){		//头尾=1
                    row.add(1);
                }else{
                    row.add(AllList.get(i-1).get(j-1) + AllList.get(i-1).get(j));
                }
            }
            AllList.add(row); 
        }
        return AllList;
    }
}
