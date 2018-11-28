package java.top.yousite.leetcode.array.middle;

public class RotateImage {
    /**
     * 48. 旋转图像
     */
    /**
     * 给定 matrix =
     * [
     *   [1,2,3],           |
     *   [4,5,6],           |
     *   [7,8,9]       _ _ _|
     * ],
     *
     * 原地旋转输入矩阵，使其变为:
     * [
     *   [7,4,1],
     *   [8,5,2],
     *   [9,6,3]
     * ]
     */

    public void rotate(int[][] matrix) {
        /**
         法一
         找规律 :得到 b[i,j] -->b [j,length-1-i] (这种需要维护一个状态表--看是否已经交换过)
         abc            b [0,1] --> [1,2]     f [1,2] --> [2,1]
         def            i [2,2] --> [2,0]     d [1,0] --> [0,1]
         ghi

         **/


        /**
         法二:

         [1,2,3]   主对角线交换        [1,4,7]    以中间为对角线，进行交换   [7,4,1]
         [4,5,6]  ------------>      [2,5,8]    -------------------->  [8,5,2]
         [7,8,9]                     [3,6,9]                           [9,6,3]


         **/
        //法二:
        int size = matrix.length;
        //主对角线交换
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {    //j在i开始
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //以中间为对角线，进行交换
        for(int i=0;i<size;i++){
            for(int j =0;j<size/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][size-1-j];
                matrix[i][size-1-j] = temp;
            }
        }
    }
}
