package java.top.yousite.leetcode.array.middle;

public class SearchA2dMatrix {
    /**
     * 74. 搜索二维矩阵
     */
    //右上开始
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = col-1; i >=0 ; i--) {
            if (matrix[0][i] == target) return true;
            if (matrix[0][i]>target) continue;
            if (matrix[0][i]<target){
                for (int j = 0; j < row; j++) {
                    if (matrix[j][i] ==target) return true;
                }
            }
        }
        return false;
    }
}
