package top.yousite.leetcode.array.middle;

public class MaxIncreaseToKeepCitySkyline {
    /**
     * 807. 保持城市天际线
     */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid.length== 0){
            return 0; }
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        //遍历 行、列 最大值
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                row[i] = Math.max(row[i],grid[i][j]);
                col[j] = Math.max(col[j],grid[i][j]);
            }
        }

        //遍历 判断最大能增加多少
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                res+=(Math.min(row[i],col[j])-grid[i][j]);


            }
        }
        return res;
    }
}
