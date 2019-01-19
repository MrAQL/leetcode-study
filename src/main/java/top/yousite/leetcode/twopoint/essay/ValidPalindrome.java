package java.top.yousite.leetcode.twopoint.essay;

public class ValidPalindrome {
    /**
     * 125. 验证回文串
     */
    //思路，碰到不是字母，数字的，指针前进或后退
    public boolean isPalindrome (String s){
        //考虑字母与数字
        if (s == null || s.length() == 0) return true;
        char[] chars = s.toCharArray();
        int begin =0;
        int end = s.length()-1;
        while (begin<=end){
            if ( !vaild(chars[begin]) ) begin++;
            else if ( !vaild(chars[end]) ) end--;
            else if (Character.toUpperCase(chars[begin])  == Character.toUpperCase(chars[end])){
                begin++;
                end--;
            }
            else
                return false;

        }
        return true;

    }

    private boolean vaild(char ch){
        if (ch>='a'&&ch<='z') return true;
        if (ch>='A'&&ch<='Z') return true;
        if (ch>='0'&ch<='9') return true;
        return false;
    }

}
