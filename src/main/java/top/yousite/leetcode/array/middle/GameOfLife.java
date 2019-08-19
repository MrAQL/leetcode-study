package top.yousite.leetcode.array.middle;

public class GameOfLife {
    /**
     * 289. 生命游戏
     */
    final static int[][] dist={{0,1},{0,-1},{-1,0},{1,0},{-1,-1},{-1,1},{1,-1},{1,1}};
    public void gameOfLife(int[][] board) {
        /**
         * live -> end = -1;
         * end  -> live = 2;
         */
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int live =count(board,i,j);
                if (board[i][j] == 1){
                    if(live>3 ||live<2){
                        board[i][j]=-1;}
                }
                if (board[i][j] == 0){
                    if (live == 3){
                        board[i][j]=2;
                    }
                }

            }
        }

        update(board);


    }

    /**
     * 计算周围存活数
     * @param board
     * @param i
     * @param j
     */
    private int count(int[][] board, int i, int j) {
        int res = 0;
        for (int k = 0; k < dist.length; k++) {
            int newRow = i+dist[k][0];
            int newCol =j+dist[k][1];
            if ((newRow>=0 && newRow<board.length && newCol>=0 &&newCol<board[0].length)
                    &&(board[newRow][newCol] ==1 ||board[newRow][newCol] == -1)){
                res++;
            }
        }

        return res;
    }

    /**
     * 更新状态
     * @param board
     */
    private void update(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == -1){
                    board[i][j]=0;
                }
                if (board[i][j]== 2){
                    board[i][j]=1;
                }
            }
        }

    }

}
