package top.yousite.leetcode.array.middle;

import java.util.*;

public class MergeIntervals {
    /**
     * 56. 合并区间
     */
    //思路:扫描线算法
    public int[][] merge(int[][] intervals) {

        List<Interval> res = new ArrayList<>();
        List<Interval> list = new ArrayList<>();
        if(intervals == null ||intervals.length==0 ||intervals[0].length == 0 ){
            return new int[0][0];
        }

        //转化为list好理解
        for (int i = 0; i < intervals.length; i++) {
            Interval interval = new Interval(intervals[i][0], intervals[i][1]);
            list.add(interval);
        }
        //首排序
        Collections.sort(list,(a,b)->a.first-b.first);

        Integer first = list.get(0).first;
        Integer end = list.get(0).end;
        for(Interval interval : list){
            if (interval.first<= end){
                end = Math.max(end,interval.end);
            }else{
                res.add(new Interval(first,end));
                first= interval.first;
                end= interval.end;
            }
        }
        res.add(new Interval(first,end));

        int[][] out = new int[res.size()][2];

        for (int i = 0; i < res.size(); i++) {
            out[i][0] = res.get(i).first;
            out[i][1] = res.get(i).end;
        }


        return out;
    }

    class  Interval{
        private int first;
        private int end;

        Interval(Integer first,Integer end){
            this.first= first;
            this.end= end; }
    }
}
