package top.yousite.leetcode.array.middle;

public class SetZeroes {
    /**
     * 73. 矩阵置零
     */
    public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] ==0){
                    //标记列
                    for (int k = 0; k < matrix[0].length; k++) {
                        if(matrix[i][k]!=0){
                            matrix[i][k]=-2333;
                        }

                    }
                    //标记行
                    for (int k = 0; k < matrix.length; k++) {
                        if(matrix[k][j]!=0){
                            matrix[k][j] = -2333;
                        }
                    }
                }
            }
        }
        update(matrix);

    }

    /**
     * 更新 -2333为 0
     * @param matrix
     */
    private void update(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -2333){
                    matrix[i][j] =0;
                }
            }
        }
    }
}
