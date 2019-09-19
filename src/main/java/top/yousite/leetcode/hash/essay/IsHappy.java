package top.yousite.leetcode.hash.essay;

import java.util.HashSet;

public class IsHappy {
    /**
     * 202. 快乐数
     */
    //HashSet存
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int mod= 0;
        int res =0;
        while (true){
            while (n!=0){
                mod = n%10;
                res+= mod*mod;
                n/=10;
            }
            if (res == 1){
                return true;
            }else if(set.contains(res)){
                return false;
            }else{
                set.add(res);
                n=res;
                res=0;
            }
        }
    }
}
