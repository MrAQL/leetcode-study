package main.java.top.yousite.leetcode.array.middle;


public class GenerateMatrix {
    /**
     * 59. 螺旋矩阵 II
     */
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int colBegin =0, colEnd =n-1 ,rowBegin =0, rowEnd=n-1;
        int count =1;
        while ( colBegin <= colEnd && rowBegin <= rowEnd ){
            //move right
            for(int i =colBegin;i<=colEnd;i++){
                result[rowBegin][i] = count++;
            }
            rowBegin++;

            //move down
            for(int i =rowBegin;i<=rowEnd;i++){
                result[i][colEnd] = count++;
            }
            colEnd--;

            //move left
            for(int i =colEnd;i>=colBegin;i--){
                result[rowEnd][i] = count++;
            }
            rowEnd--;

            //move up
            for(int i =rowEnd;i>=rowBegin;i--){
                result[i][colBegin] = count++;
            }
            colBegin++;

        }

        return result;


    }
}
