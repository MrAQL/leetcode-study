package java.top.yousite.leetcode.DP.middle;

import java.lang.annotation.Target;
import java.time.zone.ZoneOffsetTransition;
import java.util.ArrayList;
import java.util.List;

public class MinimumTotal {
    /**
     * 120. 三角形最小路径和
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        //自底向上(直接覆盖，省空间)
        if (triangle == null || triangle.size() ==0 ||triangle.get(0).size()==0) return 0;
        if(triangle.size() == 1) return triangle.get(0).get(0);
        for (int i = triangle.size()-2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min( triangle.get(i+1).get(
                        j), triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
