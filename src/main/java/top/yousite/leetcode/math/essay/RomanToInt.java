package top.yousite.leetcode.math.essay;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class RomanToInt {
    /**
     * 13. 罗马数字转整数
     */
    //思路:判断当前位与下一位大小，当前位小则减。否则加
    public int romanToInt(String s) {
        int res= 0;
        if (s == null ||s.length() == 0){
            return res;
        }
        if (s.length() ==1){
            return tranRoman(s.charAt(0));
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if (tranRoman(chars[i])>=tranRoman(chars[i+1])){
                res+=tranRoman(chars[i]);
            }
            else{
                res-=tranRoman(chars[i]);
            }
            if (i == chars.length-2){
                res+=tranRoman(chars[i+1]);
            }


        }
        return res;
    }

    //罗马数字转整数
    private static int tranRoman(char ch){
        switch (ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 2333;
        }
    }
}