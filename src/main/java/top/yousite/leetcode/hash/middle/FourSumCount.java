package top.yousite.leetcode.hash.middle;
import java.util.*;
public class FourSumCount {
    /**
     * 454. 四数相加 II
     */
    //Hash, （n^2复杂度）
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map1= new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int temp=A[i]+B[j];
                if (map1.containsKey(temp)){
                    map1.put(temp,map1.get(temp)+1);
                }else{
                    map1.put(temp,1);
                }
            }
        }

        int res= 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int temp = C[i]+D[j];
                if (map1.containsKey(0-temp)){
                    res+=map1.get(0-temp);
                }
            }
        }
        return res;
    }
}
