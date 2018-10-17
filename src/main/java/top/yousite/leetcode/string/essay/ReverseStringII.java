package main.java.top.yousite.leetcode.string.essay;

public class ReverseStringII {
    /**
     * 541. 反转字符串 II
     */
    public String reverseStr(String s, int k) {
        if(s == null ||s.length()==0 || k<=0){return s;}
        int ReverseBegin = 0;
        int ReverseEnd = k-1;
        char[] ch = s.toCharArray();
        while (ReverseBegin <= ReverseEnd){
            char temp = ch[ReverseBegin];
            ch[ReverseBegin] = ch[ReverseEnd];
            ch[ReverseEnd] = temp;
            ReverseBegin++;
            ReverseEnd--;
        }
        return new String(ch);

    }
}
