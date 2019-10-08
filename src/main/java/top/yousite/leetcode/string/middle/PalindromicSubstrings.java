package top.yousite.leetcode.string.middle;

public class PalindromicSubstrings {
    /**
     * 647. 回文子串
     * @param s
     * @return
     */
    //中心扩展法（从第i位，向2边扩展，计算是否是回文串）
    public int countSubstrings(String s) {
        int res =0;
        for (int i = 0; i < s.length(); i++) {

            //todo 长度为奇数
            int l =i;
            int r = i;
            while (l>=0 && r<s.length() &&s.charAt(l--) == s.charAt(r++)){
                res++;
            }

            //todo 长度为偶数
            l=i;
            r=i+1;
            while (l>=0 && r<s.length() &&s.charAt(l--) == s.charAt(r++)){
                res++;
            }
        }
        return res;
    }
}
