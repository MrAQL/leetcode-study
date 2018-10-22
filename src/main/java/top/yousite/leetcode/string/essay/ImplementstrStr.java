package main.java.top.yousite.leetcode.string.essay;

public class ImplementstrStr {
    /**
     * 28. 实现strStr()
     */
    //time M*N
    public int strStr(String haystack, String needle) {
        for(int i =0;;i++){
            for(int j =0;;j++){
                if(j==needle.length()) return i;
                if(i+j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
