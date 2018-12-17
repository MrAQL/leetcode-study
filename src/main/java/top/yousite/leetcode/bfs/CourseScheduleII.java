package java.top.yousite.leetcode.bfs;

import java.util.*;

public class CourseScheduleII {
    /**
     * 210. 课程表 II
     */
    /**
     * 输入: 2, [[1,0]]
     * 输出: [0,1]
     * 解释: 总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
     * 示例 2:
     *
     * 输入: 4, [[1,0],[2,0],[3,1],[3,2]]
     * 输出: [0,1,2,3] or [0,2,1,3]
     * 解释: 总共有 4 门课程。要学习课程 3，你应该先完成课程 1 和课程 2。并且课程 1 和课程 2 都应该排在课程 0 之后。
     *      因此，一个正确的课程顺序是 [0,1,2,3] 。另一个正确的排序是 [0,2,1,3] 。
     *
     */
    //bfs,拓扑排序
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //[1,0] 要学习课程 1，你需要先完成课程 0    0->1
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> res= new ArrayList<>();
        int[]inDegree = new int[numCourses];
        for(int[] temp: prerequisites ){
            inDegree[temp[0]]++;
        }
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0){
                queue.offer(i);
            }
        }
        int curZeroCount = queue.size();
        while (!queue.isEmpty()){
            //更新度
            int leftNum = queue.poll();      //出队的数值
            res.add(leftNum);
            for (int i = 0; i < prerequisites.length; i++) {
                if (leftNum == prerequisites[i][1]){
                    inDegree[prerequisites[i][0]]--;
                    if (inDegree[prerequisites[i][0]] == 0){
                        curZeroCount++;
                        queue.offer(prerequisites[i][0]);
                    }
                }
            }
        }

        if (curZeroCount == numCourses){
            int[] finalRes  = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                finalRes[i]=res.get(i);
            }
            return finalRes;
        }else{
            return new int[]{};
        }
    }
}
