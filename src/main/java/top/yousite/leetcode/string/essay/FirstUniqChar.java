package java.top.yousite.leetcode.string.essay;

public class FirstUniqChar {
    /**
     * 字符串中的第一个唯一字符
     * @param s
     * @return
     */
    /**
     * 思路: 维护一个26个字母的自定义哈希表。
     * key: 怎么存进去，就怎么取出来
     */
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0) return -1;
        //桶排序思路
        int[] bucket = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index=s.charAt(i)-'a';
            bucket[index]++;
        }
        for (int i =0 ;i <s.length();i++){
            if (bucket[s.charAt(i)-'a'] == 1){  //这步是关键(获取到第一个唯一字符串)
                return i;
            }
        }
        return -1;
    }
}
