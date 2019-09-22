package top.yousite.leetcode.greedy.middle;

import java.util.*;
import java.util.Comparator;

public class ReconstructQueue {
    /**
     * 406. 根据身高重建队列
     */
    public int[][] reconstructQueue(int[][] people) {
        //身高相等就按 k（即o1[1]，低到高）排序，否则由身高排序(即o2[0],高到低排序)
        Arrays.sort(people, (o1, o2) -> o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);
        List<int[]> list = new LinkedList<>();
        for(int [] p:people){
            list.add(p[1],p);
        }
        return list.toArray(new int[list.size()][2]);
    }
}
