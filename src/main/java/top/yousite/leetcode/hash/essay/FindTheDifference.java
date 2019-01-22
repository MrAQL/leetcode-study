package java.top.yousite.leetcode.hash.essay;

public class FindTheDifference {
    /**
     * 389. 找不同
     */
    public char findTheDifference(String s, String t) {
        //桶排序
        char res =new Character('a');
        char[] chars_s_bucket = new char[26];
        char[] chars_t_bucket = new char[26];
        for (int i = 0; i < s.length(); i++) {
            chars_s_bucket[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            chars_t_bucket[t.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (chars_s_bucket[i] != chars_t_bucket[i]){
                res= (char)('a'+i);     //index就是字母
                break;
            }
        }
        return res;
    }
}
