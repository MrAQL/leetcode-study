package java.top.yousite.leetcode.twopoint.essay;

public class ValidPalindrome {
    /**
     *125. 验证回文串
     *
     */
    //思路，碰到不是字母，数字的，指针前进或后退
    public boolean isPalindrome(String s) {
        //双指针
        char[] chars =s.toCharArray();
        int low = 0;
        int hig = chars.length-1;
        while (low<=hig){
            if (!checkNumOrLetter(chars[hig])){
                hig--;
            }
            else if (!checkNumOrLetter(chars[low])){
                low++;
            }
            else {
                if (((chars[low]+32-'a')%32)!=((chars[hig]+32-'a')%32)){
                    return false;
                }else{
                    low++;
                    hig--;
                }
            }
        }
        return  true;
    }

    public boolean checkNumOrLetter(char ch){
        if ('a'<=ch && ch<='z' ) return true;
        if ('A'<=ch && ch<='Z') return true;
        if(ch>='0'&&ch<='9')  return true;
        return false;

    }

}
