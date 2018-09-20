package top.yousite.leetcode.array.esay;
/**
 * 867. 转置矩阵
 * @author jam
 *
 */
public class Transpose {
	public int[][] transpose(int[][] A) {
        int row = A.length;  
        int col = A[0].length; 
        int[][]temp=new int[col][row];
        for ( int i= 0 ; i<row; i++){
            for ( int j= 0 ; j<col; j++){
                temp[j][i] = A[i][j];
            }
        }
        return temp;
    }
}


