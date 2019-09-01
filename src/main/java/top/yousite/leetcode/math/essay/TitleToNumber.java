package top.yousite.leetcode.math.essay;

import java.util.Arrays;
import java.util.List;

public class TitleToNumber {
    /**
     * 171. Excel表列序号
     */
    //进制转化
    public int titleToNumber(String s) {
        int res = 0;
        if (s == null || s.length() == 0){
            return res;
        }
        for (char ch :s.toCharArray()){
            res= res*26+(ch-'A'+1);
        }
        return res;

    }
}
