package java.top.yousite.leetcode.hash.essay;

public class ValidAnagram {
    /**
     * 242. 有效的字母异位词
     */
    public boolean isAnagram(String s, String t) {
        //分母异位词语 : 两个单词的组成字符是一样的(只是位置不一样)
        //桶排序思路
        if (s.length()!=s.length()) return false;
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tCount[t.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {      //注意:i的长度是数组长度
            if (sCount[i]!=tCount[i]) return false;
        }
        return true;

    }
}
