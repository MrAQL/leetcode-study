package main.java.top.yousite.leetcode.string.essay;

public class ReverseString {
    /**
     * 344. 反转字符串
     */
    public String reverseString(String s) {
        char[]ch = s.toCharArray();
        char[]newch = new char[ch.length];
        int count=0;
        for (int i =ch.length-1 ;i>=0;i--){
            newch[count++]=ch[i];

        }
        return  new String(newch);
    }
}
