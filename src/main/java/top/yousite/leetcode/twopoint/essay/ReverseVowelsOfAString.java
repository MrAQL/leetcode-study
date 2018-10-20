package main.java.top.yousite.leetcode.twopoint.essay;
public class ReverseVowelsOfAString {
    /**
     * 345. 反转字符串中的元音字母
     */

    /**
     * 双指针，一个头，一个尾。如果2个都是元音字母，则交换2个指针的元素
     */
    public String reverseVowels(String s) {
        if (s == null ||s.length() ==0) return s;
        char[] words = s.toCharArray();
        int begin = 0;
        int end = words.length-1;
        while (begin<=end){
            if (judgeVowel(words[begin]) && judgeVowel(words[end])){
                //swap begin-end
                char temp = words[begin];
                words[begin] =words[end];
                words[end]=temp;
                begin++;
                end--;
            }
            else if (judgeVowel(words[end])){
                begin++;
            }else{
                end--;
            }
        }
        return new String(words);
    }

    public boolean judgeVowel(char c){
        return c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u' |
                c == 'A' | c == 'E' | c == 'I' | c == 'O' | c == 'U';
    }


}
