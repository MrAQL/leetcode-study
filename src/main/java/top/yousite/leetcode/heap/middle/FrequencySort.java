package top.yousite.leetcode.heap.middle;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    /**
     * 451. 根据字符出现频率排序
     */
    //思路与 347题目 一样
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        PriorityQueue<Character> max = new PriorityQueue<>((o1,o2)->map.get(o2)-map.get(o1));
        //记录词频
        for(char ch : s.toCharArray()){
            if (!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for (Character ch: map.keySet()){
            max.offer(ch);
        }
        StringBuilder sb= new StringBuilder();
        while (!max.isEmpty()){
            Character poll = max.poll();
            Integer count = map.get(poll);
            for (int i = 0; i < count; i++) {
                sb.append(poll);
            }
        }
        return String.valueOf(sb);


    }
}
