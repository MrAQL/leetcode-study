package java.top.yousite.leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    /**
     * 207. 课程表
     */
    /**
     * 输入: 2, [[1,0]]
     * 输出: true
     * 解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的
     */
    //0->1
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        for(int[] temp:prerequisites){
            inDegree[temp[0]]++;  //入度
        }
        Queue<Integer> queue = new LinkedList<>();
        //为0度的入队
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0){
                queue.offer(i);
            }
        }

        //[[1,0]]
        // 0->1
        int leftCount =  queue.size(); //0度个数
        while (!queue.isEmpty()){
            int leave = queue.poll();
            for (int i = 0; i < prerequisites.length; i++) {
                if (leave == prerequisites[i][1]){     //删除0度节点
                    inDegree[prerequisites[i][0]]--;  //更新节点入度
                    if (inDegree[prerequisites[i][0]] == 0){
                        leftCount++;
                        queue.offer(prerequisites[i][0]);
                    }
                }
            }
        }
        return leftCount == numCourses;
    }
}
