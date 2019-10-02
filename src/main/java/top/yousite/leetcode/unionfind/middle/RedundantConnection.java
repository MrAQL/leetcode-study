package top.yousite.leetcode.unionfind.middle;

public class RedundantConnection {
    /**
     * 684. 冗余连接
     */
    //补查集
    private int[] parents;
    public int[] findRedundantConnection(int[][] edges) {
        int[] res = new int[2];
        parents = new int[edges.length+1];
        for (int i = 0; i < edges.length; i++) {
            parents[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            if (find(edges[i][0]).equals(find(edges[i][1]))){
                res[0] = edges[i][0];
                res[1] = edges[i][1];
            }else{
                union(edges[i][0],edges[i][1]);
            }

        }
        return res;
    }

    private void union(Integer x,Integer y){
        int xRoot = find(x);
        int yRoot = find(y);
        if (xRoot != yRoot){
            parents[yRoot] = xRoot;
        }
    }

    private Integer find(Integer n){
        while (n != parents[n]){
            n =parents[n];
        }
        return n;
    }
}
