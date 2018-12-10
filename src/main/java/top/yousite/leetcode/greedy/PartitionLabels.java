package java.top.yousite.leetcode.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    /**
     * 763. 划分字母区间
     */

    /**
     * 输入: S = "ababcbacadefegdehijhklij"
     * 输出: [9,7,8]
     * 解释:
     * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
     * 每个字母最多出现在一个片段中。
     * 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
     */
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        char[]chars = S.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int begin =0;
        for (int i = 0; i < chars.length; i++) {
            //存放每个字母的最后一位索引
            map.put(chars[i],i);    //value，index
        }
        while (begin<chars.length){
            int end =map.get(chars[begin]);
            for (int i = begin; i < end; i++) {
                if (i<end){
                    end = Math.max(end,map.get(chars[i]));
                }
            }
            res.add(end-begin+1);
            begin = end+1;

        }
        return res;
    }
}
