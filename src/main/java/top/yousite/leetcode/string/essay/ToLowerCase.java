package main.java.top.yousite.leetcode.string.essay;

public class ToLowerCase {
    /**
     * 709. 转换成小写字母
     */

    /**
     *思路：大小写ASCII相差32  'A'+ 32 == 'a'?  true
     */
    public String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if ( ch[i]>='A' && ch[i] < 'a'){
                ch[i]+=32;
            }
        }
        return new String(ch);
    }
}
