package top.yousite.leetcode.string.essay;
import java.util.*;
public class UniqueMorseRepresentations {
    /**
     * 804. 唯一摩尔斯密码词
     */
    //思路:编码+set去重
    public int uniqueMorseRepresentations(String[] words) {
        String[] character ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String word :words){
            String str="";
            for (char ch:word.toCharArray()){
                str+=character[ch-'a'];
            }
            set.add(str);
        }
        return set.size();

    }
}
