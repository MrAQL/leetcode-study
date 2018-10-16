package main.java.top.yousite.leetcode.string.essay;

public class ReverseString {
    /**
     * 344. 反转字符串
     */
    /**
     * 思路:
     * solve-1.创建新的char数组，来存储原字符串
     * solve-2.双指针，交换头尾
     */

    /**
     * solve-1.创建新的char数组，来存储原字符串
     */
    /*public String reverseString(String s) {
        char[]ch = s.toCharArray();
        char[]newch = new char[ch.length];
        int count=0;
        for (int i =ch.length-1 ;i>=0;i--){
            newch[count++]=ch[i];

        }
        return  new String(newch);
    }*/

    /**
     * solve-2.双指针，交换头尾
     * @param s
     * @return
     */
    public String reverseString(String s) {
        char[]ch =s.toCharArray();
        int begin = 0;
        int end = ch.length -1;
        while (begin<end){
            char temp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = temp;
            begin++;
            end--;
        }
        return new String(ch);
    }


}
