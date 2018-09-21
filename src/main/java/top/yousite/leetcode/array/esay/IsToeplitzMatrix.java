package top.yousite.leetcode.array.esay;

public class IsToeplitzMatrix {
	/**
	 * 766. 托普利茨矩阵
	 * @param matrix
	 * @return
	 */
	public boolean isToeplitzMatrix(int[][] matrix) {
        int row= matrix.length;
        int col = matrix[0].length;
        for(int i = 0 ; i<row-1;i++){
            for(int j = 0 ; j<col-1 ;j++){
                if(matrix[i][j] != matrix[i+1][j+1] ){	
                    return false;
                }
            }
        }
        return true;
    }
}
