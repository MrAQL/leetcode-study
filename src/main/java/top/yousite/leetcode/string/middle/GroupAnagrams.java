package top.yousite.leetcode.string.middle;
import java.util.*;

public class GroupAnagrams {
    /**
     * 49. 字母异位词分组
     */
    //思路:排序每个str，判断是否在map中存在，存在则取出map中的list增加str，
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            //TODO 存在排序后的值
            if (map.containsKey(String.valueOf(chars))){
                List<String> list = map.get(String.valueOf(chars));
                list.add(str);
            }
            //TODO 不存在排序后的str
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(String.valueOf(chars),list);
            }
        }

        List<List<String>> res  = new ArrayList<>();
        for (List<String> row: map.values()){
            res.add(row);
        }
        return res;
    }
}
