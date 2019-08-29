package top.yousite.leetcode.array.esay;

import java.util.Collections;

public class CanAttendMeetings {
    /**
     * 252-会议室
     */

    /**
     * Definition of Interval:
     * public class Interval {
     *     int start, end;
     *     Interval(int start, int end) {
     *         this.start = start;
     *         this.end = end;
     *     }
     * }
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0){
            return true;
        }
        if(intervals.size() == 1){
            return true;
        }

        Collections.sort(intervals,(a,b)->(a.start - b.start));

        for (int i = 0; i < intervals.size()-1; i++) {
            if (intervals.get(i).end <= intervals.get(i+1).start){
                continue;
            }else{
                return  false;
            }
        }
        return true;

    }


}
