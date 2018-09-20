package top.yousite.leetcode.array.esay;

/**
 * 566. 重塑矩阵
 */
public class MatrixReshape {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		//把原数组填充到一维数组中，
        //再把一维数组填充到要变形的数组中
		int row = nums.length;
        int col = nums[0].length;
        if(row * col != r * c) return nums;
        int[][] twoArray = new int[r][c]; 
        int[] oneArray = new int[r*c]; 
        for(int i=0,k=0;i<row;i++){
            for(int j =0;j<col;j++){
                oneArray[k]= nums[i][j];
                k++;
            }
         }
        for(int a =0,l=0;a<r;a++){
            for(int b=0;b<c;b++){
                twoArray[a][b] = oneArray[l];
                l++;
            }
        }
        return twoArray;
    }
}
