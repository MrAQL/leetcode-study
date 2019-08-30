package top.yousite.leetcode.array.middle;

import java.util.Collections;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    /**
     * 253. 会议室 II
     */
    //思路:判断 start 与 小根堆的堆顶 的大小，start小->interval的end入堆， 否则->堆顶出堆，interval的end入堆
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0 ){
            return 0;
        }
        Collections.sort(intervals,(a,b)->(a.start-b.start));

        //存放最小结束时间
        PriorityQueue<Integer> min= new PriorityQueue<>();
        for(Interval interval : intervals){
            if(min.isEmpty()){
                min.offer(interval.end);
            }else{
                Integer peek = min.peek();
                if (peek<interval.start){
                    min.poll();
                    min.offer(interval.end);
                }else{
                    min.offer(interval.end);
                }
            }
        }
        return min.size();
    }
}
