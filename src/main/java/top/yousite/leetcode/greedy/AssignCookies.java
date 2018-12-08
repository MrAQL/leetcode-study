package java.top.yousite.leetcode.greedy;

import java.util.Arrays;

public class AssignCookies {
    /**
     * 455. 分发饼干
     */
    public int findContentChildren(int[] g, int[] s) {
        //胃口，饼干
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;    //孩纸胃口index
        int j=0;    //饼干index
        while(i<g.length &&j<s.length){
            if(g[i]<=s[j]){
                i++;
                j++;
                count++;
            }else{
                j++;
            }
        }
        return count;
    }
}
