package top.yousite.offer;

import java.util.ArrayList;

public class FindNumbersWithSum {
    //和为S的两个数字(two point)
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int l =0;
        int r =array.length-1;
        while (l<r){
            int Asum =array[l]+array[r];
            if( Asum== sum){
                res.add(array[l]);
                res.add(array[r]);
            }else if(Asum>sum){
                r--;
            }else{
                l++;
            }
        }
        return res;
    }
}
