package top.yousite.leetcode.greedy.middle;

import java.util.Arrays;

public class LeastInterval {
    /**
     * 621. 任务调度器
     */
    //思路:通过观察获取 最短时间 公式( 最短时间由 出现次数最多的任务数量 决定)
    public int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            taskCount[tasks[i]-'A']++;
        }
        Arrays.sort(taskCount);
        int maxChar = 0;
        int max= -999;
        for (int i = 25; i >= 0; i--) {
            if (taskCount[i] >=max){
                max = taskCount[i];
                maxChar++;
            }
        }

        return Math.max( (taskCount[25]-1) * (n+1) +maxChar,tasks.length);
    }
}
