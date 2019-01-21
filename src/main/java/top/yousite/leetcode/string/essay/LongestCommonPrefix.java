package java.top.yousite.leetcode.string.essay;

import sun.text.resources.cldr.ii.FormatData_ii;

public class LongestCommonPrefix {
    /**
     * 14. 最长公共前缀
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length ==0) return "";
        if (strs.length ==1) return strs[0];
        //最长公共前缀
        int min_length = Integer.MAX_VALUE;     //最短长度
        for (int i = 0; i < strs.length; i++) {
            min_length = Math.min(min_length,strs[i].length());
        }


        for (int i = 0; i < min_length; i++) {  //最短长度
            for (int j = 0; j < strs.length-1; j++) { //个数
                if ( strs[j].charAt(i) != strs[j+1].charAt(i)){
                    return strs[0].substring(0,i);   //当i=0时，不存在会自动截取（0,0）即 ""
                }
            }
        }
        return strs[0].substring(0,min_length);
    }
}
