package java.top.yousite.leetcode.array.esay;

public class FlippingAnImage {
    /**
     * 832. 翻转图像
     */
    public int[][] flipAndInvertImage(int[][] A) {
        //逆序，反转
        /**
         输入: [[1,1,0],[1,0,1],[0,0,0]]
         输出: [[1,0,0],[0,1,0],[1,1,1]]
         **/
        //逆序
        int row = A.length;
        int col = A[0].length;
        for(int i=0 ;i<row;i++){
            int l=0;
            int r = A[0].length-1;
            while(l<r){             //不能用 !=
                int temp = A[i][l];
                A[i][l] = A[i][r];
                A[i][r]= temp;
                l++;
                r--;
            }
        }

        //反转
        for(int i=0 ;i<row;i++){
            for(int j =0;j<col;j++){
                if(A[i][j] == 0){
                    A[i][j] = 1;
                }else{
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}
