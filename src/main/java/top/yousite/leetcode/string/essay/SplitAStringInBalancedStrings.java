package top.yousite.leetcode.string.essay;

public class SplitAStringInBalancedStrings {
    /**
     * 1221. 分割平衡字符串
     * @param s
     * @return
     */
    //思路:分别记录L，R个数。相等时重置
    public int balancedStringSplit(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        int l = 0;
        int r = 0;
        int res = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == 'R'){
                r++;
            }
            if (s.charAt(i) == 'L'){
                l++;
            }
            if (r == l){
                res++;
                l=0;
                r=0;
            }
        }
        return res;
    }
}
