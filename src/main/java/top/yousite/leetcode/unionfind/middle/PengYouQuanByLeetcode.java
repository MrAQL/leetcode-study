package top.yousite.leetcode.unionfind.middle;

import sun.font.FontRunIterator;

import java.util.HashSet;
import java.util.Set;

public class PengYouQuanByLeetcode {
    /**
     * 547. 朋友圈
     */
    //思路:并查集(快合并，慢find)

    private int group; //群组数目
    public int findCircleNum(int[][] M) {
        //初始化parent
        int[] parent = new int[M.length];

        group = M.length;

        for (int i = 0; i < M.length; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j <=i; j++) {
                if (M[i][j]==1 && i!=j){
                    union(parent,i,j);
                }
            }
        }

        return group;



    }

    private Integer find(int[] parent,int elem){
        while (elem!=parent[elem]){
            elem = parent[elem];
        }
        return elem;
    }

    private void union(int[] parent,int elme1,int elme2){
        int root1 = find(parent,elme1);
        int root2 = find(parent,elme2);
        if (root1 == root2){
            return;
        }else{
            group--;
            parent[root1]=root2;
        }
    }
}
